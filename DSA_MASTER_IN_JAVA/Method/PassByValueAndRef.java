package DSA_MASTER_IN_JAVA.Method;
class Student{
     int marks;
}
public class PassByValueAndRef {
     static void byVal(int val){
          val = 30;
          // System.out.println(val);
     }

     static void change(Student s){
          s.marks = 90;
     }
     public static void main(String[] args) {
          System.out.println("Pass by value ");
          int val2 = 50;
          byVal(val2);
          System.out.println(val2);

          Student st = new Student();
          st.marks = 85;
          System.out.println("Pass by reference ");
          change(st);
          System.out.println(st.marks);
     }
}
