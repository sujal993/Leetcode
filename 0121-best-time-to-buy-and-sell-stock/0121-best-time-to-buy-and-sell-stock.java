class Solution {
    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            minprice = Math.min(price,minprice);
            maxProfit = Math.max(maxProfit,price - minprice);
        }

        return maxProfit;
    }
}