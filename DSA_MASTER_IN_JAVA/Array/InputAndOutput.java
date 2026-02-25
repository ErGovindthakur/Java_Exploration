package DSA_MASTER_IN_JAVA.Array;

import java.util.Scanner;

// Create 2 methods one will take input from user and store it into the array and second one will print array elements

class ArrayInput{
     Scanner sc = new Scanner(System.in);
     int size = 5;
     int []arr = new int[size];

     // 1. method 1 to take input into array
     void input(){
          System.out.print("Enter "+size+" elem into array : ");

          for(int i = 0; i<size; i++){
               arr[i] = sc.nextInt();
          }

          sc.close();
     }

     // 2. method 2 to traverse over array
     void showElem(){
          for(int i = 0; i<size; i++){
               System.out.print(arr[i]+" ");
          }
     }

     
}
public class InputAndOutput {
     public static void main(String[] args) {
          ArrayInput ar = new ArrayInput();

          ar.input();
          ar.showElem();
     }
}
