package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Revise [1]
public class TwoSum {
     static int[] twoSum(int[]arr,int target){
          // creating a hashmap to get O(1) look up
          Map <Integer,Integer> map = new HashMap<>();

          for(int i=0; i<arr.length; i++){
               int diff = target - arr[i];

               // checking if key already exist or not
               if(map.containsKey(diff)){
                    // return the index of both elem
                    return new int[]{map.get(diff),i};
               }else{
                    // put the array elem as key and index as value
                    map.put(arr[i],i);
               }
          }
          return new int[]{-1,-1};
     }
     public static void main(String[] args) {
          int[] arr = {3,1,7,4,2};
          int target = 9;

          System.out.println(Arrays.toString(twoSum(arr, target)));
     }
}
