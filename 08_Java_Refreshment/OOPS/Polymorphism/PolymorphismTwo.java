public class PolymorphismTwo {
     public static void main(String[] args) {
          // creating obj of parent class to referring towards child class
          RuntimePolyParent ref = new RuntimePolyChild();

          ref.GreetMe();
     }
}

class RuntimePolyParent {
     void GreetMe(){
          System.out.println("Hello, Govind");
     }
}
class RuntimePolyChild extends RuntimePolyParent {
     @Override
     void GreetMe(){
          System.out.println("Hello, Govinda");
     }
}
