import java.util.Scanner;
public class UnknownOperatorDemo{
    public static void main(String[] args)
    {
        String input;
        String againInput;
        double curResult = 0.0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Calculator is on.");

        do
        {
            System.out.println("result = 0.0");
            do
            {
                input = keyboard.nextLine();

                try
                {
                    if (input.equalsIgnoreCase("r"))
                    {
                        System.out.println("final result = " + curResult);
                    }
                    else
                    {
                        curResult = UnknownOperator.doCalculation(input, curResult);
                        System.out.println("updated result == " + curResult);
                    } // end of else
                }
                catch (UnknownOperatorException uoe)
                {
                    System.out.println(uoe.getMessage());
                }

            } while (!input.equalsIgnoreCase("r"));

            System.out.println("Again? (y/n)");
            againInput = keyboard.nextLine();
            curResult = 0.0;
        } while (!againInput.substring(0,1).equalsIgnoreCase("n"));
    }
}
