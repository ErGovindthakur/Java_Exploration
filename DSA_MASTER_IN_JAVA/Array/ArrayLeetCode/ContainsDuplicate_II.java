package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_II {
     static boolean containsDup(int[]nums, int k){

          Set<Integer> st = new HashSet<>();

          for(int i=0; i<nums.length; i++){
               if(st.contains(nums[i])){
                    return true;
               }
               st.add(nums[i]);

               if(st.size()>k)st.remove(nums[i-k]);
               System.out.println(st.toString());
          }
          return false;
     }
    public static void main(String[] args) {
     int [] nums = {1,2,3,1,2,3};
     int k = 3;
     System.out.println("Contains Dup: "+containsDup(nums, k));
    } 
}
