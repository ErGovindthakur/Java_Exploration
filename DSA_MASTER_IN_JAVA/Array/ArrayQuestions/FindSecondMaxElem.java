package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

public class FindSecondMaxElem {
     static int secondMaxElem(int [] arr){
          int max = Math.max(arr[0], arr[1]);
          int sMax = Math.min(arr[0], arr[1]);

          for(int i = 2; i<arr.length; i++){
               if(arr[i]>max){
                    int temp = max;
                    System.out.println("Temp : "+temp);
                    max = arr[i];
                    System.out.println("Max : "+max);
                    sMax = temp;
                    System.out.println("sMax : "+sMax);
               }
               if(arr[i]>sMax && arr[i]<max){
                    System.out.println("Applying : "+arr[i]);
                    sMax = arr[i];
               }
          }
          return sMax;
     }
     public static void main(String[] args) {
          int [] arr = {4,1,8,9,5};

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
