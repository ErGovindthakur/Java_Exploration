import java.util.ArrayList;

public class ThreeSum {
     static ArrayList<ArrayList<Integer>> threeSum(int[]arr,int target){
          int n = arr.length;
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();

          for(int i = 0; i<n; i++){
               for(int j= i+1; j<n; j++){
                    for(int k = j+1; k<n; k++){
                         if(arr[i]+arr[j]+arr[k]==target){
                              ArrayList<Integer> temp = new ArrayList<>();
                              temp.add(arr[i]);
                              temp.add(arr[j]);
                              temp.add(arr[k]);
                              result.add(temp);
                         }
                    }
               }
          }
          return result;
     }
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        System.out.println(threeSum(arr, target));
    }
}