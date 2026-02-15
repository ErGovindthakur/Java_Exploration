package DSA_MASTER_IN_JAVA.Basic_Of_DSA;

public class Modulo {
     public static void main(String[] args) {
          // % => Modulo operator it gives us reminder

          double num1 = 4.0;
          double num2 = 5.0;
          System.out.println(num1%num2); // 1. if a<b then a%b = a
          System.out.println(num2%num1); // output = 1

          // System.out.println((double)5/2);


          // 2. if -a % -b = -(a%b)= -output
          System.out.println(-5%-2);
          System.out.println(-2%-5);


     }
}
