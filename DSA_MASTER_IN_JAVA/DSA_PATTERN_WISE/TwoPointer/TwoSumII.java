package DSA_MASTER_IN_JAVA.DSA_PATTERN_WISE.TwoPointer;

import java.util.Arrays;

public class TwoSumII {
     static int[] twoSum2(int[]arr,int target){
          int st = 0;
          int end = arr.length-1;

          while(st<end){
               if(arr[st]+arr[end]==target){
                    return new int[]{arr[st],arr[end]};
               }else{
                    if(arr[st]+arr[end]>target){
                         end--;
                    }else{
                         st++;
                    }
                    
               }
          }
          return null;
     }
     public static void main(String[] args) {
          System.out.println("Elem : "+ Arrays.toString(twoSum2(new int[]{7,2,9,11}, 9)));
     }
}
