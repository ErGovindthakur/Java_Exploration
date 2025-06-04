import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
     Scanner charSc = new Scanner(System.in);

     System.out.print("Enter your char -: ");
     char chr = charSc.nextLine().charAt(0);

     switch (chr) {
          case 'a':
               System.out.println("you are a");
               break;
          case 'b':
               System.out.println("you are b");
               break;
          case 'c':
               System.out.println("you are c");
               break;
          default:
          System.out.println("Other char -: "+chr);
               break;
     }
     charSc.close();
  }   
}
