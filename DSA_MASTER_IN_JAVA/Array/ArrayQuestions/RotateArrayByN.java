package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class RotateArrayByN {

     // public static void rotateArr(int[]arr,int rotate){
     //      int n = rotate%arr.length;

     //      for(int j = 1; j<=n; j++){
     //           int copy = arr[0];
     //           for(int i = 0; i<arr.length-1; i++){
     //                int temp = arr[i];
     //                arr[i] = arr[i+1];
     //                arr[i+1] = temp;
     //           }
     //           arr[arr.length-1] = copy;
     //      }

     // }

     public static void rotateArrOpt(int [] arr, int rotate){
          int n = arr.length;
          if(n==0)return;
          rotate = rotate % n;

          revArr(arr,0,rotate-1);
          revArr(arr,rotate,n-1);
          revArr(arr,0,n-1);
     }

     public static void revArr(int [] arr, int st, int end){

          while(st<end){
               int temp = arr[st];
               arr[st] = arr[end];
               arr[end] = temp;
               st++;
               end--;
          }
     }
     public static void main(String[] args) {
          int [] arr = {1,2,3,4,5};
          System.out.println("Array before rotations : "+ Arrays.toString(arr));
          // rotateArr(arr, 7);
          rotateArrOpt(arr, 7);
          System.out.println("Array after rotations : "+ Arrays.toString(arr));
     }
}
