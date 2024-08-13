public class BuyAndSellProfit {
    public static void main(String[] args) {
//             [7,1,5,3,6,4]
//              4 - 6 = -2
//                6 - 1 = 5
//         Mon  -- Buy Or Sell at #7
//         Tue  -- Buy Or Sell at #1 buy
//         Wed  -- Buy Or Sell at #5
//         Thurs -- Buy Or Sell at #3
//         Fri  -- Buy Or Sell at #6  sell
//         Sat  -- Buy Or Sell at #4
                System.out.println(buyAndSellProfit(new int[]{7,1,5,3,6,4}));
//                System.out.println(buyAndSellProfit(new int[]{7,6,4,3,1}));
//        System.out.println(maxArray(new int[]{-7,-6,-12,-3,-1}));
    }
    static int buyAndSellProfit(int [] prices){
        int maxProfit = 0; // 5
        for(int i = 0; i < prices.length -1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] - prices[i] > maxProfit)
                    maxProfit = prices[j] - prices[i];
            }
        }
        return maxProfit;
    }
    static int maxArray(int [] val){
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < val.length; i++){
            if(val[i] > maxVal)
                maxVal = val[i];
        }
        return maxVal;
    }
}
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
//        Constraints:
//        1 <= prices.length <= 105
//        0 <= prices[i] <= 104
