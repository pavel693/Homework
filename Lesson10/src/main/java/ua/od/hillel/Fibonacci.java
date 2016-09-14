package ua.od.hillel;

public class Fibonacci {

    int number;

    Fibonacci(int number) {
        this.number = number;
    }

    public int numberFibonacciRecurs(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return numberFibonacciRecurs(number - 2) + numberFibonacciRecurs(number - 1);
    }

    public int numberFibonacci(int number) {
        int zero = 0;
        int first = 1;
        int result = 0;
        if (number == 0) return zero;
        if (number == 1) return first;
        for (int i = 1; i < number; i++) {
            result = zero + first;
            zero = first;
            first = result;
        }
        return result;
    }

    public int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        Fibonacci fibonacci = new Fibonacci(number);
        System.out.println(fibonacci.numberFibonacciRecurs(number));
        System.out.println(fibonacci.numberFibonacci(number));
        System.out.println(fibonacci.factorial(number));
    }
}
