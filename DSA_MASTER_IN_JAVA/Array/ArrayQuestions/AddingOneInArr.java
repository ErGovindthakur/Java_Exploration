package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class AddingOneInArr {
     static int[] addingOne(int[] arr) {

          for (int i = arr.length - 1; i >= 0; i--) {

               if (arr[i] + 1 <= 9) {
                    arr[i] = arr[i] + 1;
                    return arr;
               } else {
                    if (arr[i] + 1 == 10) {
                         arr[i] = 0;
                    }
               }
          }

          // if all digits are zero
          int[] result = new int[arr.length + 1];
          result[0] = 1;
          return result;
     }

     public static void main(String[] args) {
          int[] arr1 = { 5, 6, 7, 8 }; // for this , it's working
          System.out.println(Arrays.toString(addingOne(arr1)));
          int[] arr2 = { 9, 9, 9 }; // but i am not getting how to approach this one, since i have to increase
                                    // length here

          System.out.println(Arrays.toString(addingOne(arr2)));
     }
}
