

public class Lesson3_3 {

    public static void main(String[] args) {

//        String operation = "module";
        String operation = args[0];

        String operationAdd = "addition";
        String operationSub = "subtraction";
        String operationMul = "multiplication";
        String operationDiv = "division";
        String operationRem = "remainder";
        String operationMod = "module";

//        double firstOperand = 15;
//        double secondOperand = 12;
        double firstOperand = Double.parseDouble(args[1]);
        double secondOperand = Double.parseDouble(args[2]);

        double result1;
        double result2;

        if (operation.equals(operationAdd)) {
            result1 = firstOperand + secondOperand;
            System.out.println("Result for operation of addition is " + result1);
        }

        if (operation.equals(operationSub)) {
            result1 = firstOperand - secondOperand;
            System.out.println("Result for operation of subtraction is " + result1);
        }

        if (operation.equals(operationMul)) {
            result1 = firstOperand * secondOperand;
            System.out.println("Result for operation of multiplication is " + result1);
        }

        if (operation.equals(operationDiv)) {
            result1 = firstOperand / secondOperand;
            System.out.println("Result for operation of division is " + result1);
        }

        if (operation.equals(operationRem)) {
            result1 = firstOperand % secondOperand;
            System.out.println("Result for operation remainder of division is " + result1);
        }

        if (operation.equals(operationMod)) {
            result1 = Math.abs(firstOperand);
            result2 = Math.abs(secondOperand);
            System.out.println("For the firstOperand result for operation of module is " + result1);
            System.out.println("For the secondOperand result for operation of module is " + result2);
        }

    }
}
