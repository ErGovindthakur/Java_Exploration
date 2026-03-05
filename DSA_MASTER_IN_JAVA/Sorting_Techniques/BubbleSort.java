package DSA_MASTER_IN_JAVA.Sorting_Techniques;

import java.util.Arrays;

public class BubbleSort {
     static int[] bubbleSort(int [] arr){
          int n = arr.length;

          for(int i = 0; i<n-1; i++){
               boolean isSwapped = false;

               for(int j = 0; j<n-i-1; j++){
                    if(arr[j]>arr[j+1]){
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                         isSwapped = true;
                    }
               }

               if(!isSwapped) break;
          }
          return arr;
     }
     public static void main(String[] args) {
          int [] arr = {3,1,5,2,4};
          System.out.println(Arrays.toString(bubbleSort(arr)));
     }
}
