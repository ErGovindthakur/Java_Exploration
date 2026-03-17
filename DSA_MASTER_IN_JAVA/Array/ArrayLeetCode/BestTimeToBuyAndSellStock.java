package DSA_MASTER_IN_JAVA.Array.ArrayLeetCode;
// Revise [1]
public class BestTimeToBuyAndSellStock {
     static int bstTmToBuyAndSell(int[]arr){
          int min = arr[0]; // buy time
          int maxProfit = 0;

          // since we are supposing here 1st day is buying day
          for(int i = 1; i<arr.length; i++){
               if(arr[i]<min){
                    min = arr[i];
               }
               int profit = arr[i]-min;
               maxProfit = Math.max(maxProfit, profit);
          }
          return maxProfit;
     }
    public static void main(String[] args) {
     int[]arr = {4,1,7,9,2};
     System.out.println("Max Profit : "+ bstTmToBuyAndSell(arr));
    } 
}
