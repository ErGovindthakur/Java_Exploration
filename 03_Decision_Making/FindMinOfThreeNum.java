
public class FindMinOfThreeNum {
   public static void main(String[] args) {
     int a = 12;
     int b = 23;
     int c = 13;

     int max = 0;

     if(a>b && a>c){
          max = a;
     }else if(b>a && b>c){
          max = b;
     }else{
          max = c;
     }

     System.out.println("Max of all three num = "+ max);
   }  
}
