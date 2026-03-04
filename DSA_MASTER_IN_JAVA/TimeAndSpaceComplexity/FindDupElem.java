package DSA_MASTER_IN_JAVA.TimeAndSpaceComplexity;

public class FindDupElem {
     static int findDupEl(int [] arr){
          if(arr.length<2)return arr[0];

          int n = arr.length;

          int expectedSum = (n*(n-1))/2;

          int actualSum = 0;

          for(int el : arr){
               actualSum += el;
          }

          return actualSum-expectedSum;
     }
     public static void main(String[] args) {
          int [] arr = {1,4,3,2,4};

          int dupElm = findDupEl(arr);
          System.out.println("Dup elem : "+ dupElm);
     }
}
