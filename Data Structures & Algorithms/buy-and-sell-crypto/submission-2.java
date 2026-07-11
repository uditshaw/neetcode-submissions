class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length, max_profit = 0, highest = prices[n-1];

        for ( int i = n-2; i >=0; i-- ) {

            highest = Math.max(highest, prices[i]);
            max_profit = Math.max(max_profit, highest - prices[i]);

        }

        return max_profit;
    }
}
