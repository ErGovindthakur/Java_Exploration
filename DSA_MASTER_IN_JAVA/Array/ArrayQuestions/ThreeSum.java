import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
     // static ArrayList<ArrayList<Integer>> threeSum(int[]arr,int target){
     // int n = arr.length;
     // ArrayList<ArrayList<Integer>> result = new ArrayList<>();

     // for(int i = 0; i<n; i++){
     // for(int j= i+1; j<n; j++){
     // for(int k = j+1; k<n; k++){
     // if(arr[i]+arr[j]+arr[k]==target){
     // ArrayList<Integer> temp = new ArrayList<>();
     // temp.add(arr[i]);
     // temp.add(arr[j]);
     // temp.add(arr[k]);
     // result.add(temp);
     // }
     // }
     // }
     // }
     // return result;
     // }

     // 2. Writing optimal three sum code
     static ArrayList<ArrayList<Integer>> threeSumOpt(int[] arr, int target) {
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();

          int n = arr.length;

          Arrays.sort(arr);

          for (int i = 0; i < n - 2; i++) {
               // skip duplicate value
               if (i > 0 && arr[i] == arr[i - 1])
                    continue;

               // create a left and right pointer
               int left = i + 1;
               int right = n - 1;

               while (left < right) {
                    int sum = arr[i] + arr[left] + arr[right];

                    if (sum == target) {
                        result.add(new ArrayList<>(Arrays.asList(arr[i], arr[left], arr[right])));

                         left++;
                         right--;

                         // skip left duplicate
                         while (left < right && arr[left] == arr[left - 1])
                              left++;

                         // skip right duplicate
                         while (left < right && arr[right] == arr[right + 1])
                              right--;
                    } else if (sum < target) {
                         left++;
                    } else {
                         right--;
                    }
               }
          }
          return result;
     }

     public static void main(String[] args) {
          int arr[] = { -1, 0, 1, 2, -1, -4 };
          int target = 0;

          // System.out.println(threeSum(arr, target));

          System.out.println(threeSumOpt(arr, target));
     }
}