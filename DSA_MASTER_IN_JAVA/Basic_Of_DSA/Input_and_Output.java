package DSA_MASTER_IN_JAVA.Basic_Of_DSA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_and_Output {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter first side: ");
            double a = sc.nextDouble();

            System.out.print("Enter second side: ");
            double b = sc.nextDouble();

            System.out.print("Enter third side: ");
            double c = sc.nextDouble();

            // 1. Validation: Triangle Inequality Theorem
            // Sum of any two sides must be greater than the third side
            if (a + b > c && a + c > b && b + c > a) {
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("Semi-perimeter: %.2f\n", s);
                System.out.printf("Area of Triangle: %.2f\n", area);
            } else {
                System.out.println("Error: These sides cannot form a valid triangle.");
            }

        } catch (InputMismatchException e) {
            // 2. Exception Handling: Catches non-numeric input
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            sc.close(); // Good practice to close the scanner
        }
    }
}
