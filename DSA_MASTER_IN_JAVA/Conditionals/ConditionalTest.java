package DSA_MASTER_IN_JAVA.Conditionals;

import java.util.Scanner;

public class ConditionalTest {
     public static void main(String[] args) {

          // Level 1 (Odd even check)
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          if(!sc.hasNextInt()){
               System.out.println("Enter a valid input");
               sc.close();
          }
          int num = sc.nextInt();
          if(num==0){
               System.out.println("Zero");
          }else{

               if(num%2==0){
                    if(num>0){
                         System.out.println("Positive Even");
                    }else{
                         System.out.println("Negative Even");
                    }
               }else if(num%2!=0){
                    if(num>0){
                         System.out.println("Positive Odd");
                    }else{
                         System.out.println("Negative Odd");
                    }
               }
          }
          
          
          // Level 2 (valid Triangle)

          System.out.print("Enter first Side of Triangle : ");
          if(!sc.hasNextInt()){
               System.out.println("First side is not valid");
               // sc.close();
               return;
          }
          int a = sc.nextInt();

          System.out.print("Enter second Side of Triangle : ");
          if(!sc.hasNextInt()){
               System.out.println("Second side is not valid");
               // sc.close();
               return;
          }
          int b = sc.nextInt();

          System.out.print("Enter third Side of Triangle : ");
          if(!sc.hasNextInt()){
               System.out.println("Third side is not valid");
               // sc.close();
               return;
          }
          int c = sc.nextInt();

          if(a+b>c && b+c>a && a+c>b){
               System.out.println("Valid Triangle");
               if(a==b && b==c && c==a){
                    System.out.println("Equilateral");
               }else if(a==b || b==c || c==a){
                    System.out.println("Isosceles");
               }else{
                    System.out.println("Scalene");
               }
          }else{
               System.out.println("Triangle is not valid");
          }


          // Level 3 (Login + Role Authorization)
          System.out.print("Enter the username : ");
          String username = sc.next();

          System.out.print("Enter the password : ");
          String password = sc.next();

          System.out.print("Enter the role : ");
          String role = sc.next();


          if(username.equals("admin") && password.equals("12345")){
               if(role.equals("manager")){
                    System.out.println("Welcome "+role);
               }else if(role.equals("user")){
                    System.out.println("Welcome "+role);
               }else{
                    System.out.println("Welcome guest user");
               }
          }else{
               System.out.println("Invalid credentials, check username or password");
          }
          sc.close();
     }
}
