package DSA_MASTER_IN_JAVA.Pattern_Printing;

public class RhombusPattern {
     public static void main(String[] args) {
          
          int star = 5;
     
          for(int i = star; i>=1; i--){
               for(int j=i; j>1; j--){
                    System.out.print("  ");
               }
               for(int k=1; k<=star; k++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
}
