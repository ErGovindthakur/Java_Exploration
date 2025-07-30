import java.util.*;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Writing a Calculator Program -:");

        Scanner inp = new Scanner(System.in);

        while (true) {
            int ans = 0;

            System.out.print("Enter your operator (+, -, *, /, %, x to exit): ");
            char op = inp.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting Calculator...");
                break;
            }

            System.out.print("Enter two numbers: ");
            int a = inp.nextInt();
            int b = inp.nextInt();

            if (op == '+') {
                ans = a + b;
                System.out.println("Ans: " + ans);
            } else if (op == '-') {
                ans = a - b;
                System.out.println("Ans: " + ans);
            } else if (op == '*') {
                ans = a * b;
                System.out.println("Ans: " + ans);
            } else if (op == '/') {
                if (b != 0) {
                    ans = a / b;
                    System.out.println("Ans: " + ans);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (op == '%') {
                if (b != 0) {
                    ans = a % b;
                    System.out.println("Ans: " + ans);
                } else {
                    System.out.println("Error: Cannot modulo by zero.");
                }
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }

        inp.close(); // Optional, but good practice
    }
}
