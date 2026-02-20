package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class TrianglePattern {
     public static void main(String[] args) {
          // Triangle pattern with 5 rows and 5 cols

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number must be +ve: ");
          int rows = sc.nextInt();

          // System.out.print("Enter the number cols +ve: ");
          // int cols = sc.nextInt();

          for(int i = 1; i<=rows; i++){
               for(int j = 1; j<=i; j++){
                    // 1. Start Triangle
                    // System.out.print("* ");
                    
                    // 2. Number Triangle
                    System.out.print(j+" ");
               }
               System.out.println();
          }
          sc.close();
     }
}
