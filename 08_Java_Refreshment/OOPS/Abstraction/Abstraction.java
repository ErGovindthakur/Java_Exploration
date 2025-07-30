public class Abstraction {
  public static void main(String[] args) {
     AbstractionParent abs = new AbstractionChild();
     abs.msg();
  }   
}

// Abstraction => It is the process of writing code where we hide unnecessary data from user point of view , and showing only essential data which is required.

abstract class AbstractionParent {
     abstract void msg();
}

class AbstractionChild extends AbstractionParent{

     void msg(){
          System.out.println("Child abstraction method");
     }
}