package DSA_MASTER_IN_JAVA.Sorting_Techniques;

import java.util.Arrays;

public class SelectionSort {

     static int[] sort(int[] arr) {

          int n = arr.length;
          for (int j = 0; j < n-1; j++) {
               int min = j;
               for (int i = j + 1; i < n ; i++) {
                    if (arr[i] < arr[min]) {
                         min = i;
                    }
               }

               if (j != min) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
               }
          }

          return arr;
     }

     public static void main(String[] args) {
          int[] arr = { 4, 1, 3, 2, 5 };
          System.out.println(Arrays.toString(sort(arr)));
     }
}
