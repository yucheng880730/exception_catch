public class UnknownOperatorException extends Exception {

    public  UnknownOperatorException(String errorMessage){

        super(errorMessage);

        /*

        if(input == null){

            System.out.println("Must specify an operation.");

        }else {
            char op = input.charAt(0);
            String operator = String.valueOf(op);
            System.out.println(operator + "is an unknown operation.");
        }

        */
    }

}
