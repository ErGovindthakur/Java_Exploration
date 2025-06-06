class MyException {
 int a = 5;
 int b = 0;

 void displayCalculation(){
     try {
          System.out.println(a/b);
     } catch (Exception e) {
          System.out.println("I got an error -: "+ e.getMessage());
     }
 }
} 

public class ExceptionHandling {

     public static void main(String[] args) {
          MyException myExp =new MyException();
          myExp.displayCalculation();
     }
}