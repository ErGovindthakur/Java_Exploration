package DSA_MASTER_IN_JAVA.Loops.DoWhileLoop;

import java.util.Scanner;

public class MenuProgram {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int choice;

          do{
               System.out.println("1. Add data");
               System.out.println("2. Sub data");
               System.out.println("3. Multi data");
               System.out.println("4. Exit Program");

               System.out.println("Enter your choice");
               if(!sc.hasNextInt()){
                    System.out.println("Enter valid choice");
                    sc.close();
                    return;
               }
               choice = sc.nextInt();

               switch(choice){
                    case 1:
                         System.out.println("Added two num");
                         break;
                    case 2:
                         System.out.println("Subs two num");
                         break;
                    case 3:
                         System.out.println("Multiplied two num");
                         break;
                    case 4:
                         System.out.println("Exit Program");
                         sc.close();
                         return;
                         // break;
                    default:
                         sc.nextInt();
                         continue;
               }
          }while(choice!=4);

          sc.close();
     }
}
