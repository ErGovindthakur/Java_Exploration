package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
     
     public static void main(String[] args) {
          int []arr = {1,3,2,1};
          Set<Integer> set = new HashSet<>();
          boolean flag = false;
          for(int i = 0; i<arr.length; i++){
               if(set.contains(arr[i])){
                    flag = true;
                    break;
               }else{
                    set.add(arr[i]);
               }
          }

          System.out.println("Array contains dup elem : "+flag);

          
     }
}
