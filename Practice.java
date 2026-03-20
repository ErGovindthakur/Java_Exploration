import java.util.*;
public class Practice {
     static ArrayList<ArrayList<Integer>> threeSumOpt(int[]arr,int target){

          int n = arr.length;
          ArrayList<ArrayList<Integer>> arl = new ArrayList<>();
          Arrays.sort(arr);

          // loop to detect duplicate and traverse whole arr
          for(int i = 0; i<n-2; i++){
               int left = i+1;
               int right = n-1;

               // skipping dup elem
               if(i>0 && arr[i]==arr[i-1]) continue;

               while(left<right){
                    int sum = arr[i]+arr[left]+arr[right];

                    if(sum==target){
                         arl.add(new ArrayList<>(Arrays.asList(arr[i],arr[left],arr[right])));
                         left++;
                         right--;


                         // skipping left dup
                         while(left<right && arr[left]==arr[left-1])left++;
                         
                         // skipping right dup
                         while(left<right && arr[right]==arr[right+1])right--;
                    }else if(sum<target){
                         left++;
                    }else{
                         right--;
                    }


               }
          }
          return arl;
     }
     public static void main(String[] args) {
          int arr[] = { -1, 0, 1, 2, -1, -4 };
          int target = 0;

          System.out.println(threeSumOpt(arr, target));
     }
}
