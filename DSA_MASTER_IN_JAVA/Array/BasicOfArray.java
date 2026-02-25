package DSA_MASTER_IN_JAVA.Array;

public class BasicOfArray {
     public static void main(String[] args) {
          // array stores collection of similar types of data in a contiguous manner

          // 1. Defining an array
          int []arr = {1,2,3,4,5};
          // 2. accessing array value using index (since array starts from 0th index and end at (size-1)index)
          int size = arr.length-1;
          System.out.println("Size of array : "+size);
          System.out.println(arr[0]);// first index
          System.out.println(arr[size]); // last index


          // 3. since arrays are mutable so we can modify and delete array elem
          System.out.println("Before updating : "+arr[3]); // before updating
          arr[3] = 90;
          System.out.println("After updating : "+arr[3]); // after updating


          // 4. Array initialization using constructor
          int []arr2 = new int[5];
          // Note if we don't insert any elem into the array by default it takes zero "0" at each index

          // 5. putting value into array
          arr2[0] = 1;
          arr2[1] = 2;
          arr2[2] = 3;
          arr2[3] = 4;
          arr2[4] = 5;

          // 6. traversal of array using for loop
          System.out.println("Traversal of array using for loop");
          for(int i = 0; i<arr2.length; i++){
               System.out.print(arr2[i]+" ");
          }

          System.out.println();
          // 7. traversal of array using while loop
          System.out.println("Traversal of array using while loop");

          int i = 0;
          while(i<arr2.length){
               System.out.print(arr2[i]+" ");
               i++;
          }
     }
}
