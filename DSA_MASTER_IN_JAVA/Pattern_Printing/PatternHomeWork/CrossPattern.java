package DSA_MASTER_IN_JAVA.Pattern_Printing.PatternHomeWork;

public class CrossPattern {
     public static void main(String[] args) {
          int rowsCols = 11; // only odd number should be here

          for(int i = 1; i<=rowsCols; i++){
               for(int j = 1; j<=rowsCols; j++){
                    if(i==j || (i+j==rowsCols+1)){
                         System.out.print("*");
                    }else{
                         System.out.print(" ");
                    }
               }
               System.out.println();
          }
     }
}
