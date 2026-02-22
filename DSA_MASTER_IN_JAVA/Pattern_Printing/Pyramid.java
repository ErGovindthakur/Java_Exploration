package DSA_MASTER_IN_JAVA.Pattern_Printing;

public class Pyramid {
     public static void main(String[] args) {
          int star = 5;

          for(int i = star; i>=1; i--){
               for(int j = 1; j<i; j++){
                    System.out.print(" ");
               }
               for(int k = 1; k<=2*(star-i)+1; k++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}
