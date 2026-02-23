package DSA_MASTER_IN_JAVA.Pattern_Printing;

public class BridgePattern {
     public static void main(String[] args) {
          int star = 5;
          for(int i = 1; i<=star; i++){

               // 1. vertically flipped triangle
               for(int j = star-i; j>=1; j--){
                    System.out.print("*");
               }

                // 2. pyramid (top)
               for(int j = 1; j<=(2*i)-1; j++){
                    if(i==1){
                         System.out.print("*");
                    }else{
                         System.out.print(" ");
                    }
               }

               // 3. Horizontally flipped triangle
               for(int j = star-i; j>=1; j--){
                    System.out.print("*");
               }
               System.out.println();
          }

         
     }
}
