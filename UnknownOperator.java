public class UnknownOperator {

    public static double doCalculation(String input, double curResult) throws UnknownOperatorException {

        if (input.equals("")){

            throw new UnknownOperatorException("Must specify an operation.");

        }
        char op = input.charAt(0);
        String operator = String.valueOf(op);
        String str = input.substring(1);
        double num = Double.parseDouble(str);

        if (!"+".equals(operator) && !"-".equals(operator) && !"*".equals(operator) && !"/".equals(operator) && !"%".equals(operator)){

            throw new UnknownOperatorException(operator + " is an unknown operation.");

        }


        switch (operator){

            case "+":
                curResult = curResult + num;
                break;
            case "-":
                curResult = curResult - num;
                break;
            case "*":
                curResult = curResult * num;
                break;
            case "/":
                curResult = curResult / num;
                break;
            case "%" :
                curResult = curResult % num;
                break;
        }


        System.out.println("result " + operator + num + " = +" + curResult);

        return curResult;

    }
}
