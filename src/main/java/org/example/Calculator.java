package org.example;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Aruments pattern is  number operator number");
            System.exit(1);
        }

        double operand1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double operand2 = Double.parseDouble(args[2]);

        double result = calculate(operand1, operator, operand2);
        System.out.println("Result: " + result);
    }

    private static double calculate(double operand1, String operator, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "x":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
            default:
                System.out.println("Error: Invalid operator");
                System.exit(1);
                return 0;
        }
    }
}