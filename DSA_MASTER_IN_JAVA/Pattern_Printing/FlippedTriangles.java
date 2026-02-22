package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class FlippedTriangles {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number must be +ve : ");
          int num = sc.nextInt();

          // for(int i = 0; i<num; i++){
          //      for(int j = 1; j<=num-i; j++){
          //           System.out.print("* ");
          //      }
          //      System.out.println();
          // }

          for(int i = num; i>=1; i--){
               for(int j = 1; j<=i; j++){
                    // 2. flipped triangle with num
                    // System.out.print(j+" ");
                    // 3. flipped triangle with alphabets
                    System.out.print((char)(j+96)+" ");
               }
               System.out.println();
          }

          sc.close();
     }
}
