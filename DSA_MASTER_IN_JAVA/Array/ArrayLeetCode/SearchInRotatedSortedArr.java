package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

public class SearchInRotatedSortedArr {
     static int searchTarget(int[]arr,int target){
          int n = arr.length;
          int st = 0;
          int end = n-1;

          while(st<=end){
               int mid = (st+end)/2;
               if(arr[mid]==target) return mid;

               if(arr[st]<=target && target<=arr[mid]){
                    end = mid - 1;
               }else{
                    st = mid+1;
               }
          }
          return -1;
     }
     public static void main(String[] args) {
          int [] arr = {4,5,6,7,0,1,2};
          int target = 7;

          System.out.println("Elem found at index : "+searchTarget(arr, target));
     }
}
