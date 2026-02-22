package DSA_MASTER_IN_JAVA.Pattern_Printing;

public class DoubleFlippedTriangle {
     public static void main(String[] args) {
          int star = 5;

          for(int i = star; i>=1; i--){

               for(int j = 1; j<star-i+1; j++){
                    System.out.print(" ");
               }

               for(int j = 1; j<=i; j++){
                    System.out.print("*");
               }
              
               System.out.println();
          }
     }
}
