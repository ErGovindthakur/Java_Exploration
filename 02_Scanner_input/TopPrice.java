import java.util.Scanner;

public class TopPrice {
     public static void main(String[] args) {
          Scanner toySc = new Scanner(System.in);
          System.out.print("Enter the price of toy -: ");

          int toyPrice = toySc.nextInt();

          if(toyPrice > 100){
               System.out.println("Toy price is very high can't be purchased");
          }else{
               System.out.println("Toy price is "+toyPrice+ " Rs can be purchasable");
          }

          toySc.close();
     }
}
