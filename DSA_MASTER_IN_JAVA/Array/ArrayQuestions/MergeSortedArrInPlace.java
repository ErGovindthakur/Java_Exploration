package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class MergeSortedArrInPlace {
     static int[] mergeSortedArrInPlace(int[] arr1, int n, int[] arr2, int m) {
          int i = n - 1; // last valid elem in arr1
          int j = m - 1; // last valid elem in arr2
          int k = m + n - 1; // last index of arr1

          while (i >= 0 && j >= 0) {
               if (arr1[i] > arr2[j]) {
                    arr1[k] = arr1[i];
                    i--;
               } else {
                    arr1[k] = arr2[j];
                    j--;
               }
               k--;
          }

          while (j >= 0) {
               arr1[k] = arr2[j];
               j--;
               k--;
          }
          return arr1;
     }

     public static void main(String[] args) {
          int[] arr1 = { 1, 3, 5, 0, 0, 0 };
          int[] arr2 = { 2, 4, 6 };
          System.out.println(Arrays.toString(mergeSortedArrInPlace(arr1, 3, arr2, 3)));
     }
}
