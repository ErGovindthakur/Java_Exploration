package DSA_MASTER_IN_JAVA.Sorting_Techniques.Basic_Sorting;

import java.util.Arrays;

public class AllSortingTechniques {
     // 1. bubble sort
     static int[] bubbleSort(int[]arr){
          int n = arr.length;
          for(int i = 0; i<n-1; i++){
               int count = 0;
               for(int j = 0; j<n-i-1; j++){
                    if(arr[j]>arr[j+1]){
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                         count++;
                    }
               }

               if(count==0){
                    break;
               }
          }
          return arr;
     }
     public static void main(String[] args) {
          int[]arr = {3,1,4,2,5};
          System.out.println(Arrays.toString(bubbleSort(arr)));
     }
}
