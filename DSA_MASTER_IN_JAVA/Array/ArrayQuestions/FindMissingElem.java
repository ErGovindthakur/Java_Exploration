package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

public class FindMissingElem {
     // static int missingElem(int [] arr){

     //      if(arr.length<2)return 2;

     //      int max = Integer.MIN_VALUE;
     //      int n = arr.length;
     //      int actualSum = 0;
     //      int expectedSum = 0;

     //      // 1. loop to identify max elem
     //      for(int i = 0; i<n; i++){
     //           if(arr[i]>max){
     //                max = arr[i];
     //           }
     //      }

     //      // 2. loop to get sum of elem present in array
     //      for(int i = 0; i<n; i++){
     //           actualSum += arr[i];
     //      }

     //      // loop to get expected sum 
     //      for(int i = 1; i<=max; i++){
     //           expectedSum += i;
     //      }

     //      return actualSum==expectedSum ? 0 : expectedSum-actualSum;
     // }

     static int missingElemOpt(int [] arr){
          int n = arr.length;
          int expectedSum = ((n+1)*(n+2))/2;
          int actualSum = 0;

          for(int elem : arr){
               actualSum += elem;
          }

          return expectedSum - actualSum;
     }
    public static void main(String[] args) {
     // int [] arr = {8, 2, 4, 5, 3, 7, 1};
     int [] arr = {1,2};

     // int num = missingElem(arr);
     // System.out.println("missing elem : "+num);

     int missingElem = missingElemOpt(arr);
     System.out.println("Missing elem : "+missingElem);
    } 
}
