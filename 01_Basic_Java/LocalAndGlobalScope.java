public class LocalAndGlobalScope {
     public static void main(String[] args) {
          // It can use any where in the code
          int a = 12;
          if(a>10){
               // it can only be used inside the block
               int b = 15;
               System.out.println("Inner block b -: "+b);
          }
          System.out.println("Outer block a -: "+a);
     }
}
