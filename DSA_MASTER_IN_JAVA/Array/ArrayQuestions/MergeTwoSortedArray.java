package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class MergeTwoSortedArray {
     static int[] mergeTwoSortedArr(int[]arr1,int[]arr2){
          int [] mergeArr = new int[arr1.length + arr2.length];
          int i = 0;
          int j = 0;
          int k = 0;

          while(i<arr1.length && j<arr2.length){
               if(arr1[i]<arr2[j]){
                    mergeArr[k] = arr1[i];
                    i++;
                    k++;
               }else{
                    mergeArr[k] = arr2[j];
                    k++;
                    j++;
               }
          }

          // checking for remaining value
          while(i<arr1.length){
               mergeArr[k] = arr1[i];
               i++;
               k++;
          }
          while(j<arr2.length){
               mergeArr[k] = arr2[j];
               j++;
               k++;
          }
          return mergeArr;
     }
     public static void main(String[] args) {
          int [] arr1 = {5,7,9};
          int [] arr2 = {1,6,8,10};

          System.out.println(Arrays.toString(mergeTwoSortedArr(arr1, arr2)));
     }
}
