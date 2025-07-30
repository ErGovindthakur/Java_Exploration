public class Polymorphism {
     public static void main(String[] args) {
          CompileTimePoly cmp = new CompileTimePoly();

          System.out.println(cmp.add(1,2));
          System.out.println(cmp.add(1.2, 2.3));
     }
}

// Polymorphism => It's something like same piece of code behaves differently based on context
// These are of two types -> 1) Compile time(using method overloading), 2) Run time (using method overriding)

class CompileTimePoly {
     // using method overloading => same method name with same

     public int add(int a, int b){
          return a + b;
     }
     public double add(double a, double b){
          return a + b;
     }

}