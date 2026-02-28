package DSA_MASTER_IN_JAVA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
     static ArrayList<Integer> addingOne(int [] arr){
          ArrayList<Integer> ans = new ArrayList<>();
          int n = arr.length;
          int carry = 1;

          for(int i = n-1; i>=0; i--){
               int sum = arr[i]+carry;

               if(sum<=9){
                    ans.add(sum);
                    carry=0;
               }else{
                    ans.add(0);
                    carry=1;
               }
          }
          if(carry==1){
               ans.add(carry);
          }
          Collections.reverse(ans);
          return ans;
     }
     public static void main(String[] args) {
          int [] arr = {1,2,3,4,5};
          System.out.println(addingOne(arr));

          int [] arr2 = {1,2,3,4,5,9};
          System.out.println(addingOne(arr2));
     }
}
