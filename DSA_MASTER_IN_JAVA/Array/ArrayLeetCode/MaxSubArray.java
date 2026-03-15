package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.ArrayList;

public class MaxSubArray {
     static int maxSubArr(int[]arr){
          ArrayList<Integer> tempArl = new ArrayList<>();
          ArrayList<Integer> resultArl = new ArrayList<>();

          int n = arr.length;
          int sum = 0;
          int maxSum = Integer.MIN_VALUE;


          for(int i = 0; i<n; i++){
               sum += arr[i];
               tempArl.add(arr[i]);

               if(sum>maxSum){
                    maxSum = sum;
                    resultArl = new ArrayList<>(tempArl);
               }
               if(sum<0){
                    // System.out.println("Applied");
                    sum = 0;
                    tempArl.clear();
               }
          }
          System.out.println(resultArl);
          return maxSum;
     }
     public static void main(String[] args) {
          int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
          System.out.println("Max subArr sum : "+ maxSubArr(arr));
     }
}
