package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class MergeSortedArrInPlace {
     static int[] mergeSortedArrInPlace(int[]arr1,int[]arr2){
          int n1 = arr1.length;
          int n2 = arr2.length;


          int i = 0;
          int j = 0;

          while(i<n1/2 && j<n2){
               // since we know arr1 has larger length
               if(arr1[i]<arr2[j]){
                    i++;
               }else{
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                    i++;
               }
          }
          System.out.println(i+","+j);
          Arrays.sort(arr2);
          while(j<n2){
               arr1[i] = arr2[j];
               i++;
               j++;
          }
          return arr1;
     }
     public static void main(String[] args) {
          int [] arr1 = {1,3,5,0,0,0};
          int [] arr2 = {2,4,6};
          System.out.println(Arrays.toString(mergeSortedArrInPlace(arr1, arr2)));
     }
}
