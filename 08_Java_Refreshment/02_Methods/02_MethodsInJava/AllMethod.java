import java.util.Scanner;

public class AllMethod {
     public static void main(String[] args) {
          String myGreeting = greeting();
          System.out.println(myGreeting);

          int add = addNum(12,12);
          System.out.println(add);

          Scanner sc  = new Scanner(System.in);
          System.out.print("Enter your Name -: ");
          String name = sc.nextLine();

          String personalize = sayMeHello(name);
          System.out.println(personalize);

          sc.close();
     }

     static String greeting(){
          return "Hello Govind";
     }

     // Method with parameter

     static int addNum(int a, int b){
          return a + b;
     }

     static String sayMeHello(String name){
          String message =  "Hello " + name;
          return message;
     }
}
