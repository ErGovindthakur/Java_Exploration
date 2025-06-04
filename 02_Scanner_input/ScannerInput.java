import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1 -: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num 2 -: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /) -: ");
        String operator = sc.next();

        int cal = 0;
        boolean valid = true;

        switch (operator) {
            case "+":
                cal = num1 + num2;
                break;
            case "-":
                cal = num1 - num2;
                break;
            case "*":
                cal = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    valid = false;
                } else {
                    cal = num1 / num2;
                }
                break;
            default:
                System.out.println("Please enter a valid operator -: ");
                valid = false;
        }

        if (valid) {
            System.out.println("Your calculated value -: " + cal);
        }

        sc.close();
    }
}
