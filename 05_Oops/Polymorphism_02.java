// 🧠 What is Runtime Polymorphism?

// Runtime polymorphism in Java is achieved using method overriding, where a subclass provides a specific implementation of a method that is already defined in its parent class.

// The method to be called is determined at runtime (not at compile time).

// This allows dynamic method dispatch, a key part of polymorphic behavior in OOP.

class Bank {
     double investRate() {
          return 0.00;
     }
}

class SBI extends Bank {
     @Override
     double investRate() {
          return 1.23;
     }
}

class HDFC extends Bank {
     @Override
     double investRate() {
          return 2.33;
     }
}

class ICICI extends Bank {
     @Override
     double investRate() {
          return 3.12;
     }
}

public class Polymorphism_02 {
     public static void main(String[] args) {
          Bank bank;
          // SBI
          bank = new SBI();
          System.out.println("SBI Interest Rate: " + bank.investRate() + "%");

          // HDFC
          bank = new HDFC();
          System.out.println("HDFC Interest Rate: " + bank.investRate() + "%");

          // ICICI
          bank = new ICICI();
          System.out.println("ICICI Interest Rate: " + bank.investRate() + "%");
     }
}
