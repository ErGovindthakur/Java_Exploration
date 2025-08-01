import java.util.Scanner;

public class Basic {
     public static void main(String[] args) {
          guessName("Govind", 5);
     }

     static void guessName(String name, int attempt) {
          Scanner gsName = new Scanner(System.in);

          while (attempt >= 0) {
               System.out.println(attempt);
               System.out.println("Guess My Name");
               String myName = gsName.next();
               System.out.println(myName);
               if(myName.equalsIgnoreCase(name)){
                    System.out.println("You guessed the correct name -: "+ name);
                    break;
               }

               if(attempt <= 0){
                    System.out.println("Your attempt  -: "+ attempt + " The correct name was -: "+name);
                    break;
               }
               --attempt;
          }
          gsName.close();
     }
}
