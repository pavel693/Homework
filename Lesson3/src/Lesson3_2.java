
//

import java.util.Scanner;

public class Lesson3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a type of operation:");
        String operation = scanner.nextLine();

        System.out.println("Please, enter a firstOperand:");
        double firstOperand = scanner.nextDouble();

        System.out.println("Please, enter a secondOperand:");
        double secondOperand = scanner.nextDouble();

//        String operation = "module";

        String operationAdd = "addition";
        String operationSub = "subtraction";
        String operationMul = "multiplication";
        String operationDiv = "division";
        String operationRem = "remainder";
        String operationMod = "module";

//        double firstOperand = 15;
//        double secondOperand = 12;

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