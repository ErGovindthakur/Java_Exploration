package DSA_MASTER_IN_JAVA.Array.ArrayBasicRefreshers;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayBasicQuestions {

     // 1. find max elem
     static int findLargest(int[]arr){
          int n = arr.length;
          int max = arr[0];
          for(int i = 1; i<n; i++){
               if(arr[i]>max){
                    max = arr[i];
               }
          }
          return max;
     }

     // 2. find second max elem
     static int findSecondMax(int[]arr){
          int n = arr.length;
          int max = Integer.MIN_VALUE;
          int sMax = Integer.MIN_VALUE;

          for(int i = 0; i<n; i++){
               if(arr[i]>max){
                    sMax = max;
                    max = arr[i];
               }else{
                    if(arr[i]>sMax && arr[i]<max){
                         sMax = arr[i];
                    }
               }
          }
          return (sMax==Integer.MIN_VALUE) ? -1 : sMax;
     }

     // 3. reverse array
     static int[] revArr(int[]arr){
          int st = 0;
          int end = arr.length-1;

          while(st<end){
               int temp = arr[st];
               arr[st] = arr[end];
               arr[end] = temp;
               st++;
               end--;
          }

          return arr;

     }

     // 4. check array is sorted
     static boolean isSorted(int[]arr){
          int n = arr.length;
          for(int i = 0; i<n-1; i++){
               if(arr[i]>arr[i+1]){
                    return false;
               }
          }
          return true;
     }

     // 5. move all zeros to end
     static int[] moveAllZeroEnd(int[]arr){
          int i = 0; // fast move
          int j = 0; // slow move

          while(i<arr.length){
               // j will only increase when swapping happens
               if(arr[i]!=0){
                    if(i!=j){
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                    }
                    j++;
               }
               i++;
          }
          return arr;
     }

     // 6. remove duplicate from sorted array
          static ArrayList<Integer> removeDup(int[]arr){
               ArrayList <Integer> arrL = new ArrayList<>();
               int n = arr.length;

               for(int i = 0; i<n-1; i++){
                    if(arr[i]!=arr[i+1]){
                         arrL.add(arr[i]);
                    }
               }
               arrL.add(arr[n-1]);
               return arrL;
          }
     public static void main(String[] args) {
          int [] arr = {5,1,3,4,2};
          // System.out.println("Max elem : "+findLargest(arr));
          // System.out.println("SMax : "+findSecondMax(arr));
          // System.out.println("Rev Arr : "+ Arrays.toString(revArr(arr)));

          // System.out.println("Array is sorted : "+ isSorted(arr));
          // System.out.println("Array is sorted : "+ isSorted(new int[]{1,2,3}));

          // System.out.println("Move Zero to end: "+Arrays.toString(moveAllZeroEnd(new int[]{1, 2, 0, 4, 3, 0, 5, 0})));

          // System.out.println(removeDup(new ArrayList<>(Arrays.asList(1,2,2,3,3))));

         System.out.println(removeDup(new int[]{1,1,2,2,3,3,4,4}));

     }
}
