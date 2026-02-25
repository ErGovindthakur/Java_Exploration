package DSA_MASTER_IN_JAVA.Array.ArrayQuestions;

public class ArrayModification {
     public static void main(String[] args) {
          int [] arr = {1,2,3,4,5};

          for(int i = 0; i<arr.length; i++){
               if(i%2!=0){
                    arr[i] = arr[i]*2;
               }else{
                    arr[i] = arr[i]+10;
               }
          }

          // printing array elem
          for(int i = 0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
          }
     }
}
