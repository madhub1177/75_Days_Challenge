/**
 * Best_Time_to_Buy_and_Sell_Stock
 */
public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
    int [] nums={7,1,5,3,6,4};
    int result=maxProfit(nums);
    System.out.println(result); 
    }
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-buy;
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,diff);
        }
        return profit;
    }
}