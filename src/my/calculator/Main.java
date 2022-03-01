package my.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter operation: ");
        String operation = scanner.next();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        BasicCalculator basicCalculator = new BasicCalculator();
        final double result = basicCalculator.calculate(firstNumber, secondNumber, operation.charAt(0));
        System.out.println("Result of " + firstNumber + operation + secondNumber + " = " + result);
    }
}


