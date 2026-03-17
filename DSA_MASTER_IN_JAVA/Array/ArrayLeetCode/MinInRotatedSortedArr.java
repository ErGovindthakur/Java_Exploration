package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;
// Revise [1]
public class MinInRotatedSortedArr {

    static int minElem(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int mid = (left + right) / 2;

            // here eliminate the part there is no possibility of getting min value
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,1,2};

        System.out.println("Min elem : " + minElem(arr));
    }
}