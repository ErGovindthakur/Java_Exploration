package DSA_MASTER_IN_JAVA.TimeAndSpaceComplexity;

import java.util.Arrays;

public class MoveAllZerosAtEnd {
     static int[] moveZerosAtEnd(int[] arr) {

          int n = arr.length;
          for (int j = 0; j < n - 1; j++) {
               int count = 0;
               for (int i = 0; i < n - 1 - j; i++) {
                    if (arr[i] == 0) {
                         int temp = arr[i];
                         arr[i] = arr[i + 1];
                         arr[i + 1] = temp;
                         count++;
                    }
               }
               if(count==0)break;
          }
          return arr;
     }

     static int[] moveZerosAtEnd2(int[]arr){

          int n = arr.length;

          int index = 0;

          for(int i = 0; i<n; i++){
               if(arr[i]!=0){
                    arr[index++] = arr[i];
               }
          }

          while(index<n){
               arr[index++] =0;
          }

          return arr;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 0, -2, 3, 0, 4, 8, 0, 10, 12 };

          // first one bubble sort approach
          System.out.println(Arrays.toString(moveZerosAtEnd(arr)));

          // second one two pointer approach
          System.out.println(Arrays.toString(moveZerosAtEnd2(arr)));
     }
}
