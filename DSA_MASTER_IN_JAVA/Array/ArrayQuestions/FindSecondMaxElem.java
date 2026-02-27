package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

public class FindSecondMaxElem {
     static int secondMaxElem(int [] arr){
          int max = Integer.MIN_VALUE;
          int sMax = Integer.MIN_VALUE;

          for(int i = 2; i<arr.length; i++){
               if(arr[i]>max){
                    sMax = max;
                    max = arr[i];
               }
               if(arr[i]>sMax && arr[i]<max){
                    System.out.println("Applying : "+arr[i]);
                    sMax = arr[i];
               }
          }
          return (sMax == Integer.MIN_VALUE) ? -1 : sMax;
     }
     public static void main(String[] args) {
          // int [] arr = {4,1,8,9,5};
          // int [] arr = {5,5,5,5,5};
          int [] arr = {12,12,12,12,1};
          int sMax = secondMaxElem(arr);

          System.out.println("Second max elem : "+ sMax);
          // int max = arr[0];
          // for(int i = 1; i<arr.length; i++){
          //      if(arr[i]>max){
          //           max = arr[i];
          //      }
          // }

          // System.out.println("Max : "+ max);
     }
}
