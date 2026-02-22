package DSA_MASTER_IN_JAVA.Pattern_Printing;

public class Diamond {
    public static void main(String[] args) {
        int star = 5;

        // Top pyramid
        for(int i = 1; i <= star; i++){
            for(int j = 1; j <= star - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom inverted pyramid
        for(int i = star - 1; i >= 1; i--){
            for(int j = 1; j <= star - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}