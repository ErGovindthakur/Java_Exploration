package DSA_MASTER_IN_JAVA.Loops.WhileLoop;

import java.util.Scanner;

public class ATMLogic {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          double balance = 1000;
          int attempts = 0;

          // ===== PIN VALIDATION LOOP =====
          while (attempts < 3) {
               System.out.print("Enter your PIN: ");
               String pin = sc.next();

               if (pin.equals("1234")) {
                    System.out.println("Login successful\n");

                    // ===== ATM MENU LOOP =====
                    while (true) {
                         System.out.println("1. Check Balance");
                         System.out.println("2. Deposit Money");
                         System.out.println("3. Withdraw Money");
                         System.out.println("4. Exit");
                         System.out.print("Choose option: ");

                         int option;
                         if (!sc.hasNextInt()) {
                              System.out.println("Invalid choice\n");
                              sc.next(); // clear input
                              continue;
                         }
                         option = sc.nextInt();

                         switch (option) {
                              case 1:
                                   System.out.println("Balance: " + balance + "\n");
                                   break;

                              case 2:
                                   System.out.print("Enter deposit amount: ");
                                   if (!sc.hasNextDouble()) {
                                        System.out.println("Invalid amount\n");
                                        sc.next();
                                        continue;
                                   }
                                   double deposit = sc.nextDouble();
                                   if (deposit <= 0) {
                                        System.out.println("Amount must be positive\n");
                                        continue;
                                   }
                                   balance += deposit;
                                   System.out.println("Deposited successfully\n");
                                   break;

                              case 3:
                                   System.out.print("Enter withdrawal amount: ");
                                   if (!sc.hasNextDouble()) {
                                        System.out.println("Invalid amount\n");
                                        sc.next();
                                        continue;
                                   }
                                   double withdraw = sc.nextDouble();
                                   if (withdraw <= 0 || withdraw > balance) {
                                        System.out.println("Insufficient balance\n");
                                        continue;
                                   }
                                   balance -= withdraw;
                                   System.out.println("Withdrawal successful\n");
                                   break;

                              case 4:
                                   System.out.println("Thank you for using ATM");
                                   sc.close();
                                   return;

                              default:
                                   System.out.println("Invalid option\n");
                         }
                    }
               } else {
                    attempts++;
                    System.out.println("Wrong PIN. Attempts left: " + (3 - attempts));
               }
          }

          System.out.println("Card blocked. Too many wrong attempts.");
          sc.close();
     }
}
