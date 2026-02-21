package DSA_MASTER_IN_JAVA.Pattern_Printing;

import java.util.Scanner;

public class StarPlusPattern {
     public static void main(String[] args) {
          // printing a star plus pattern
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the num of rows must be +ve : ");
          int rows = sc.nextInt();
          System.out.print("Enter the num of cols must be +ve : ");
          int cols = sc.nextInt();

          if(rows==cols && (rows%2!=0 && cols%2!=0)){

               for(int i = 1; i<=rows; i++){
                    for(int j = 1; j<=cols; j++){
                         if(j==((cols/2)+1) || i==((rows/2)+1)){
                              System.out.print("* ");
                         }else{
                              System.out.print("  ");
                         }
                    }
                    System.out.println();
               }
          }else{
               System.out.println("Please Enter odd number must be greater than 1 and rows and cols must be equal");
          }
          sc.close();
     }
}
