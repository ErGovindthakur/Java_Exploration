/*
 
What is Abstraction?
Abstraction is the process of hiding complex internal implementation details and showing only essential features to the user.

In Java, abstraction is achieved using:

Abstract classes

Interfaces

🎯 Real-World Example: ATM Machine
🔍 Why it's a perfect example:
When you use an ATM:

You see options like "Withdraw", "Check Balance", "Deposit".

You don’t see how it connects to the bank server, verifies PIN, or updates the database.

That's abstraction — hiding the internal logic and exposing only essential actions.

 */

// Abstract class
abstract class ATM {
     // Abstract method: must be implemented by subclass
     abstract void withdraw(double amount);

     // Abstract method
     abstract void checkBalance();

     // Concrete method: common for all ATMs
     void insertCard() {
          System.out.println("Card inserted successfully.");
     }
}

// creating subclass to access abstract class methods

class SBI_ATM extends ATM {
     private double balance = 10000;

     @Override
     void withdraw(double amount) {
          if (amount <= balance) {
               balance -= amount;
               System.out.println("₹" + amount + " withdrawn successfully.");
          } else {
               System.out.println("Insufficient balance.");
          }
     }

     @Override
     void checkBalance() {
          System.out.println("Available Balance: ₹" + balance);
     }
}

public class AbstractionByClass {
     public static void main(String[] args) {
          ATM userATM = new SBI_ATM(); // Referenced by abstract class

          userATM.insertCard(); // Concrete method
          userATM.checkBalance(); // Overridden method
          userATM.withdraw(2500); // Overridden method
          userATM.checkBalance(); // Check updated balance
     }
}