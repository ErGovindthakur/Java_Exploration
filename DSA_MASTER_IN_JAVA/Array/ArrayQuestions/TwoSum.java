package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

class TwoSumClass{
     int[] twoSum(int []arr, int target){

          int [] copy = Arrays.copyOf(arr, arr.length);

          int st = 0; 
          int end = copy.length-1;

          while(st<end){
               int sum = copy[st] + copy[end];

               if(sum==target){
                    return new int[] {copy[st],copy[end]};
               }else{
                    if(sum<target){
                         st++;
                    }else{
                         end--;
                    }
               }
          }

          return new int[] {-1,-1};
     }
}
public class TwoSum {
     public static void main(String[] args) {
          TwoSumClass twoSum = new TwoSumClass();
          int [] arr = {5,2,1,6,8,9};
          int target = 14;

         String data =  Arrays.toString(twoSum.twoSum(arr,target));
         System.out.println(data);
     }
}
