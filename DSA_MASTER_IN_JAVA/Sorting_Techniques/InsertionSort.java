package DSA_MASTER_IN_JAVA.Sorting_Techniques;

import java.util.Arrays;

public class InsertionSort {
     static int[] insertionSort(int[]arr){
          int n = arr.length;
          
          for(int i = 1; i<n; i++){
               int key = arr[i];
               int j = i-1;

               while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j--;
               }
               arr[j+1] = key;
          }
          return arr;
     }
     public static void main(String[] args) {
          int [] arr = {2,1,5,4,3};
          System.out.println(Arrays.toString(insertionSort(arr)));
     }
}
