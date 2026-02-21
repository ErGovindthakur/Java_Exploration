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

          if(rows==cols && rows%2!=0){ // since here our rows and cols both are same so check either rows or cols
               int mid = (cols/2)+1; // here we can take either row or cols both
               for(int i = 1; i<=rows; i++){
                    for(int j = 1; j<=cols; j++){
                         if(j==mid || i==mid){
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
