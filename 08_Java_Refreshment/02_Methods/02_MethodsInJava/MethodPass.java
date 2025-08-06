import java.util.Arrays;

public class MethodPass {
    public static void main(String[] args) {
     String name = "Govind Thakur";

     change(name);

     // Method overloading with var args method parameters
     demo(1,2,2,3,4,5);
     demo("a","b","c","d","e");
    } 


    static void demo(int ...a){
     System.out.println(Arrays.toString(a));
    }
    static void demo(String ...a){
     System.out.println(Arrays.toString(a));
    }
    static void change(String name){
     name = "Govind";
     System.out.println(name);

     varArgs(12, 23, "Govind","Thakur");
    }

    static void varArgs(int a, int b, String ...c){
     
    }


}
