package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class FlippedTriangle {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number must be +ve : ");
          int num = sc.nextInt();

          for(int i = 0; i<num; i++){
               for(int j = 1; j<=num-i; j++){
                    System.out.print("* ");
               }
               System.out.println();
          }

          sc.close();
     }
}
