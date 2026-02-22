package DSA_MASTER_IN_JAVA.Pattern_Printing.FlippedTriangle;

public class VerticallyStarFlippedTriangle {
     public static void main(String[] args) {
          int star = 5;

               for(int j = star; j>=1; j--){
                    for(int k = 1; k<j; k++){
                         System.out.print(" ");
                    }
                     for(int l = 1; l<=star-j+1; l++){
                         // 1. pyramid pattern
                         // System.out.print("* "); // space makes it pyramid

                         // 2. vertically flipped  star triangle
                         // System.out.print("*");

                         // 3. vertically flipped number triangle
                         // System.out.print(l);

                         // 4. vertically flipped alphabet triangle
                         System.out.print((char)((star-j+1)+64));
                    }
                    System.out.println();
               }
     }
}
