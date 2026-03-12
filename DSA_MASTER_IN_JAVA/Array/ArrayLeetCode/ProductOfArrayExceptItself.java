package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
     static int[] productArr(int[]arr){
          int n = arr.length;
          int [] arr2 = new int[n];

          // setting up arr[0] = 1;
          arr2[0] = 1; // [1,0,0,0,0]

          // creating a prefix array from arr2
          for(int i = 1; i<n; i++){
               arr2[i] = arr2[i-1] * arr[i-1];
          }
          
          // creating suffix array and final product
          int suffix = 1;

          for(int i = n-1; i>0; i--){
               arr2[i] = arr2[i]*suffix;
               suffix = suffix * arr[i];
          }
          return arr2;
     }
     public static void main(String[] args) {
          int [] arr = {1,0,3,0,5};
		// int [] arr2 = new int[arr.length];
		// int n = arr.length;
		
		// 1. brute force tmc O(n^2) and spc O(n)
// 		for(int i = 0; i<n; i++){
// 		    int mult = 1;
// 		    for(int j = 0; j<n; j++){
// 		        if(i!=j){
// 		           mult *= arr[j];
// 		        }
// 		    }
// 		    arr2[i] = mult;
// 		}
        
        // 2. better approach tmc O(n), spc O(n)
     //    int product = 1;
     //    for(int i = 0; i<n; i++){
     //        if(arr[i]!=0){
     //        product *= arr[i];
     //        }
     //    }
     //    int st = 0;
     //    while(st<n){
            
     //        arr2[st] = product/arr[st];
     //        st++;
     //    }
	//     System.out.print(Arrays.toString(arr2));

     System.out.println(Arrays.toString(productArr(new int[]{1,2,3,4,5})));
     }
}
