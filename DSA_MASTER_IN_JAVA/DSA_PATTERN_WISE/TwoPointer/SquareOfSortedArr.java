package DSA_MASTER_IN_JAVA.DSA_PATTERN_WISE.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquareOfSortedArr {
     // Method 1 (Not much optimized due to space complexities)
     static int[] sqr(int[] arr) {

          int n = arr.length;

          ArrayList<Integer> negArr = new ArrayList<>();
          ArrayList<Integer> posArr = new ArrayList<>();

          // loop to fill both negative list and positive list
          for (int i = 0; i < n; i++) {
               if (arr[i] < 0) {
                    negArr.add(arr[i]);
               } else {
                    posArr.add(arr[i]);
               }
          }

          int[] result = new int[negArr.size() + posArr.size()];

          // squaring both list
          for (int i = 0; i < negArr.size(); i++) {
               negArr.set(i, negArr.get(i) * negArr.get(i));
          }
          for (int i = 0; i < posArr.size(); i++) {
               posArr.set(i, posArr.get(i) * posArr.get(i));
          }

          // checking negative and positive elem
          if (negArr.size() > 0) {
               Collections.reverse(negArr);
          }

          // now applying two pointer approach
          int i = 0;
          int j = 0;
          int k = 0;

          while (i < negArr.size() && j < posArr.size()) {
               if (negArr.get(i) < posArr.get(j)) {
                    result[k] = negArr.get(i);
                    k++;
                    i++;
               } else {
                    result[k] = posArr.get(j);
                    k++;
                    j++;
               }
          }

          // checking for remaining elem
          while (i < negArr.size()) {
               result[k] = negArr.get(i);
               k++;
               i++;
          }

          while (j < posArr.size()) {
               result[k] = posArr.get(j);
               k++;
               j++;
          }
          System.out.println(negArr);
          System.out.println(posArr);

          return result;
     }


     // method 2 (optimized with two pointer approach)

     static int[] sqrOpt(int[]arr){
          int n = arr.length;
          int left = 0; // 1st pointer starts from 0th index
          int right = n-1; // 2nd pointer starts from (n-1)th index

          int k = n-1; // since we are pushing value from the back side of array

          int [] result = new int[n];

          while(left<=right){
               if(arr[left]*arr[left]>arr[right]*arr[right]){
                    result[k] = arr[left]*arr[left];
                    k--;
                    left++;
               }else{
                    result[k] = arr[right]*arr[right];
                    k--;
                    right--;
               }
          }
          return result;
     }
     public static void main(String[] args) {
          int[] arr = { -3, -1, 2 };
          // System.out.println(Arrays.toString(sqr(arr)));

          System.out.println(Arrays.toString(sqrOpt(arr)));
          
     }
}
