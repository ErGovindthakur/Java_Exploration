public class SpiralPattern{
     public static void main(String[] args) {
          int num = 7;

          for(int i = 1; i<=num; i++){
               for(int j = 1; j<=num; j++){
                    // if(i==1 || i==5 || j==1 || j==5){
                    //      System.out.print(1+" ");
                    // }else{
                    //      if(i==2 || j==2 || i==4 || j==4){
                    //           System.out.print(2+" ");
                    //      }else{
                    //           System.out.print("3 ");
                    //      }
                    // }

                    // improved logic 
                    // Note => just look for min value

                    // Heart of the logic
                    int layer = Math.min(
                         Math.min(i, j),
                         Math.min(num-i+1, num-j+1)
                    );
                    System.out.print(layer+" ");
               }
               System.out.println();
          }
     }
}