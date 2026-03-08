package DSA_MASTER_IN_JAVA.DSA_PATTERN_WISE.TwoPointer;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArr {
     static void removeDupFrmSrtArr(int[]arr){
          int n = arr.length;

          int i = 0; // fast
          int j = 0; // slow

          while(i<n){
               if(arr[i]!=arr[j]){
                    if(arr[j]==arr[j+1] || arr[j]!=arr[i]){
                         int temp = arr[j+1];
                         arr[j+1] = arr[i];
                         arr[i] = temp;
                    }

                    // Just for debugging
                    // if(arr[j]!=arr[i]){
                    //    System.out.println("True");
                    // }
                    j++;
               }
               i++;
               System.out.println(i+" "+j);
          }

     }
     public static void main(String[] args) {
          int [] arr = {1,1,1,2,2,3,3,3,4,4};

          removeDupFrmSrtArr(arr);

          System.out.println(Arrays.toString(arr));
     }
}
