// 4. Polymorphism
// Same method behaves differently depending on context.

// Method overloading -> When the two or more methods name are same and args may be diff called Method overloading
class Polymorphism{
     //Compile-time (Method Overloading):
     int add(int a, int b){
          return a+b;
     }
     double add(double a, double b){
          return a + b;
     }
}
public class Polymorphism_01 {
  public static void main(String[] args) {
     Polymorphism ply = new Polymorphism();
     System.out.println(ply.add(1,2));
     System.out.println(ply.add(2.32 , 3.23));
  }   
}
