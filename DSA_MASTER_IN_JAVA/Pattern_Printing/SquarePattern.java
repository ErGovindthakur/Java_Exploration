package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class SquarePattern {
     public static void main(String[] args) {
          // square pattern 5*5 rows and cols

          Scanner sc  = new Scanner(System.in);

          System.out.print("Enter the number (+ve) of rows : ");
          if(!sc.hasNextInt()){
               System.out.println("Enter valid rows");
               sc.close();
               return;
          }
          int rows = sc.nextInt();

          System.out.print("Enter the number (+ve) of cols : ");
          if(!sc.hasNextInt()){
               System.out.println("Enter valid cols");
               sc.close();
               return;
          }
          int cols = sc.nextInt();

          for(int i = 1; i<=rows; i++){
               // int num = 65; // ascii value of 'A'
               for(int j = 1; j<=cols; j++){
                    // 1. Star Square
                    // System.out.print("* ");

                    // 2. Number Square
                    // System.out.print(j+" ");

                    // 3. Alphabet Square (Capital Letter)
                    // System.out.print((char)num+" ");
                    // num++;

                    // 4. Alphabet Square (small letter)
                    // System.out.print((char)(j+96)+" "); // since 'a' starts at "97"

                    // 5. Repeated number pattern
                    System.out.print(i+" ");
               }
               System.out.println();
          }

          sc.close();
     }
}
