package DSA_MASTER_IN_JAVA.Pattern_Printing.FlippedTriangle;

public class VerticallyStarFlippedTriangle {
     public static void main(String[] args) {
          int star = 5;

               for(int j = star; j>=1; j--){
                    for(int k = 1; k<j; k++){
                         System.out.print(" ");
                    }
                     for(int l = 1; l<=star-j+1; l++){
                         // System.out.print("* "); // space makes it pyramid
                         System.out.print("*");
                    }
                    System.out.println();
               }
     }
}
