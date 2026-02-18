/*
Problem statements
Write a program that:

Takes student marks (0–100)

Prints grade:

A → 90–100

B → 75–89

C → 60–74

D → 40–59

Fail → below 40
*/

import java.util.Scanner;

public class If_Else {
     public static void main(String[] args) {
          Scanner gradSc = new Scanner(System.in);

          System.out.print("Enter your marks : ");

          double marks = gradSc.nextDouble();

          if(marks<0 || marks>100){
               System.out.println("Enter a valid marks greater than 0 and less than or equal to 100");
          }else{
               if(marks>=90){
                    System.out.println("You got A Grad");
               }else if(marks>=75){
                    System.out.println("You got B Grad");
               }else if(marks>=60){
                    System.out.println("You got C Grad");
               }else if(marks>=40){
                    System.out.println("You got D Grad");
               }else{
                    System.out.println("You are Fail");
               }
          }

          gradSc.close();
     }
}
