package DSA_MASTER_IN_JAVA.Array;

public class PassByValAndRef {
     public static void main(String[] args) {

          // With variable => pass by value works
          int x = 10;
          System.out.println("Before change : "+ x);
          change(x);
          System.out.println("After change : "+ x);

          // with array/obj => pass by ref works
          int arr[] = {1,2,3,4,5};
          System.out.println("Before change : "+arr[0]);
          change1(arr);
          System.out.println("After change : "+arr[0]);

     }
     
     public static void change(int x) {
          x = 12;
          // System.out.println("Before change : "+ x);
     }
     public static void change1(int []x) {
          x[0] = 12;
          // System.out.println("Before change : "+ x);
     }
}
