package DSA_MASTER_IN_JAVA.Basic_Of_DSA;

public class Hello_DSA {
public static void main(String[] args) {
     System.out.println("Hello DSA"); // print string
     System.out.print("Hello Govind\n");

     // print numbers
     System.out.println(69+1);

     // 1. Variables => holds some data

     int num = 9; // int data types
     System.out.println(num);
     int num2; // declaration
     num2 = 18; // initialization
     System.out.println(num2);

     int multiply = num * num2; // definition
     System.out.println("Multiply Value -: "+multiply);


     // arithmetic ops
     System.out.println(num+num2);
     System.out.println(num-num2);
     System.out.println(num*num2);
     System.out.println(num/num2);

     // 2. double data type
     double marks = 90.9;
     System.out.println(marks);

     // ops on double
     double x = 9;
     double y = 18;
     System.out.println(x/y);
     System.out.println(x%y);

     // 3. area of circle
     double r = 9;
     double area = 3.14 * r * r;
     System.out.println(area);
}  
}