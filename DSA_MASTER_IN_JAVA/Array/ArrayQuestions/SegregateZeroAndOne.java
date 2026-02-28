package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class SegregateZeroAndOne {
     static void segregateZeroAndOne(int [] arr){
          int n = arr.length;

          int st = 0;
          int end = n-1;

          while(st<end){
               if(arr[st]==0 && arr[end]==1){
                    st++;
                    end--;
               }else{
                    if(arr[st]==0){
                         st++;
                    }else if(arr[end]==1){
                         end--;
                    }else{
                         if(arr[st]==1 && arr[end]==0){
                              int temp = arr[st];
                              arr[st] = arr[end];
                              arr[end] = temp;
                              st++;
                              end--;
                         }
                    }
               }
          }
     }
     public static void main(String[] args) {
          int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

          segregateZeroAndOne(arr);

          System.out.println(Arrays.toString(arr));
     }
}
