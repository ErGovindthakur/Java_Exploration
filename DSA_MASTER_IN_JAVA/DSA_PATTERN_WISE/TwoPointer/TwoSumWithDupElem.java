package DSA_MASTER_IN_JAVA.DSA_PATTERN_WISE.TwoPointer;

import java.util.ArrayList;

public class TwoSumWithDupElem {
     static ArrayList<Integer> twoSumWithDup(int[] arr, int target) {
          ArrayList<Integer> arl = new ArrayList<>();

          int st = 0;
          int end = arr.length - 1;

          while (st < end) {
               if (arr[st] + arr[end] == target) {
                    arl.add(arr[st]);
                    arl.add(arr[end]);
                    
                    int left = arr[st];
                    int right = arr[end];

                    while(st<end && arr[st]==left){
                         st++;
                    }

                    while(st<end && arr[end]==right){
                         end--;
                    }
               } else if (arr[st] + arr[end] > target) {
                    end--;
               } else {
                    st++;
               }
               // st++;
               // end--;
          }
          return arl;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7 };
          int target = 7;

          System.out.println(twoSumWithDup(arr, target));

     }
}
