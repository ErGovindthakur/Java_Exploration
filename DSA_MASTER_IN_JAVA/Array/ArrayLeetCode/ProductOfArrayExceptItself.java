package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
     public static void main(String[] args) {
          	int [] arr = {1,0,3,0,5};
		int [] arr2 = new int[arr.length];
		
		int n = arr.length;
		
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
        int product = 1;
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
            product *= arr[i];
            }
        }
        int st = 0;
        while(st<n){
            
            arr2[st] = product/arr[st];
            st++;
        }
	    System.out.print(Arrays.toString(arr2));
     }
}
