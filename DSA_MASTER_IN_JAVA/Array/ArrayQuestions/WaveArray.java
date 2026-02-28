package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

import java.util.Arrays;

public class WaveArray {
     static void waveArr(int [] arr){
          int n = arr.length;

          for(int i = 0; i<n-1; i=i+2){
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
          }
     }
     public static void main(String[] args) {
          int [] arr = {1, 2, 3, 4, 5};

          waveArr(arr);

          System.out.println(Arrays.toString(arr));
     }
}
