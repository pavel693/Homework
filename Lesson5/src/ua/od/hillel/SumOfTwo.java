package ua.od.hillel;

import java.util.Scanner;

public class SumOfTwo {

    public static int sumOfTwo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumOfTwo();
        System.out.println("Sum of two numbers is: " + sum);
    }
}
