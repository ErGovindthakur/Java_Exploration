public class SpiralPattern{
     public static void main(String[] args) {
          int num = 5;

          for(int i = 1; i<=num; i++){
               for(int j = 1; j<=num; j++){
                    if(i==1 || i==5 || j==1 || j==5){
                         System.out.print(1+" ");
                    }else{
                         if(i==2 || j==2 || i==4 || j==4){
                              System.out.print(2+" ");
                         }else{
                              System.out.print("3 ");
                         }
                    }
                    // System.out.print(j+" ");
               }
               System.out.println();
          }
     }
}