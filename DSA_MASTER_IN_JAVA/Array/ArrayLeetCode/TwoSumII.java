package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.Arrays;

public class TwoSumII {
     static int[] twoSum2(int[]arr,int target){
          int n = arr.length; 
          int st = 0;
          int end = n-1;

          while(st<end){
               if(arr[st]+arr[end]==target){
                    return new int[]{st+1,end+1};
               }else if(arr[st]+arr[end]<target){
                    end--;
               }else{
                    st++;
               }
          }
          return null;
     }
     public static void main(String[] args) {
          int [] arr = {2,3,4};
          int target  = 6;
          
          System.out.println("Target elem are : "+ Arrays.toString(twoSum2(arr, target)));
     }
}
