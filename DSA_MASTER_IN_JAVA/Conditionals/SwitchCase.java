package DSA_MASTER_IN_JAVA.Conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Validate first number
        System.out.print("Enter first number: ");
        if (!sc.hasNextInt()) {
            System.out.println("❌ Invalid input! Please enter an integer.");
            sc.close();
        }
        int num1 = sc.nextInt();

        // Validate second number
        System.out.print("Enter second number: ");
        if (!sc.hasNextInt()) {
            System.out.println("❌ Invalid input! Please enter an integer.");
            sc.close();
        }
        int num2 = sc.nextInt();

        // Operator input
        System.out.print("Enter operator (+, -, *, /): ");
        String opr = sc.next();

        switch (opr) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;

            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("❌ Division by zero is not allowed");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("❌ Invalid operator! Use +, -, *, /");
        }

        sc.close();
    }
}
