package DSA_MASTER_IN_JAVA.Conditionals;

import java.util.Scanner;

public class TernaryOpr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter your user password: ");
        String password = sc.nextLine();

        String result = (userName.equals("admin") && password.equals("12345"))
                ? "Login Done"
                : (!userName.equals("admin"))
                    ? "Enter valid user name"
                    : "Enter valid password";

        System.out.println(result);

        sc.close();
    }
}
