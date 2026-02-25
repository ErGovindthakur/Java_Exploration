package DSA_MASTER_IN_JAVA.Array;

import java.util.Arrays;

public class ShallowVsDeepCopy {
     public static void main(String[] args) {
          // 1. shallow copy => Here the change in one array and modify the another array data, where the array is being copied from.Here we copy address of array.

          int [] arr = {1,2,3,4,5};

          int [] newArr = arr;
          System.out.println("Arr : "+arr[0]);

          newArr[0] = 99; // here the change in the value of one array can modify the value of original array
          System.out.println("NewArr : "+arr[0]);


          // 2. Deep Copy => Here we copy the elements of one array into another array.

          // Method 1 to deep copy
          int [] deepCopy = Arrays.copyOf(arr, arr.length);

          deepCopy[0] = 100;
          System.out.println("Arr : "+ arr[0]);
          System.out.println("Deep copy : "+ deepCopy[0]);
     }
}
