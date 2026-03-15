package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

public class MaxProductSubArray {
     static int maxProductSubArr(int[]arr){
          int n = arr.length;
          int max = arr[0];
          int min = arr[0];
          int result = arr[0];


          for(int i = 1; i<n; i++){
              if(arr[i]<0){
               int temp = max;
               max = min ;
               min = temp;
              }

              min = Math.max(min, min*arr[i]);
              max = Math.max(max, max*arr[i]);

              result = Math.max(result, max);
          }
          return result;
     }
     public static void main(String[] args) {
          int [] arr = {-3,-1,-1};
          System.out.println("Max product : "+maxProductSubArr(arr));
     }
}
