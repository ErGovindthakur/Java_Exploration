package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
     public static void main(String[] args) {
          // printing hollow rectangle
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter num of rows must be +ve : ");
          int rows = sc.nextInt();

          System.out.print("Enter num of cols must be +ve : ");
          int cols = sc.nextInt();


          for(int i = 1; i<=rows; i++){
               for(int j = 1; j<=cols; j++){
                    if(i==1 || j==1 || i==rows || j==cols){
                         System.out.print("* ");
                    }else{
                         System.out.print("  "); // here we required two space we have to manage above start and space both
                    }
               }
               System.out.println();
          }
          sc.close();
     }
}
