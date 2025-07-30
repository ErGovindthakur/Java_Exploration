public class Inheritance {
   public static void main(String[] args) {
     // Creating an obj (instance of child class to access the property of parent class)
     Child child = new Child();

     child.Greet();
     child.Message();
   }  
}

class ParentClass{
     String name = "Parent";

     public void Message(){
          System.out.println("Hey I am from class -: "+ name);
     }
}

class Child extends ParentClass {
     String name = "Child";

     public void Greet(){
          System.out.println("Hello, I'm form class -: "+name);
     }
}
