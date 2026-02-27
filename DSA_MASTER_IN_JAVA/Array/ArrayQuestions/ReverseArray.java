package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class ReverseArray {

     public static void revArr(int [] arr){
          int st = 0;
          int end = arr.length - 1;

          while(st<end){
               int temp = arr[st];
               arr[st] = arr[end];
               arr[end] = temp;
               st++;
               end--;
          }
     }
     public static void main(String[] args) {
          int [] arr = {1,2,3,4,5};

          revArr(arr);

          System.out.println("array : "+ Arrays.toString(arr));
     }
}
