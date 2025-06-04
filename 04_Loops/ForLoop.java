import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
     Scanner tblScanner = new Scanner(System.in);
     System.out.print("Enter the num -: ");

     int tblNum = tblScanner.nextInt();
     for(int i = 1; i<=10; i++){
          System.out.println(tblNum+" * "+i+ " = "+ (i*tblNum));
     }
     tblScanner.close();
    } 
}
