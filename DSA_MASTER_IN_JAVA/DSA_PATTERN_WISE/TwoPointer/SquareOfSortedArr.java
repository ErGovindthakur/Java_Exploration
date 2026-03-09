package DSA_MASTER_IN_JAVA.DSA_PATTERN_WISE.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquareOfSortedArr {
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

     public static void main(String[] args) {
          int[] arr = { -4, -1, 0, 3, 10 };
          System.out.println(Arrays.toString(sqr(arr)));
          // sqr(arr);
     }
}
