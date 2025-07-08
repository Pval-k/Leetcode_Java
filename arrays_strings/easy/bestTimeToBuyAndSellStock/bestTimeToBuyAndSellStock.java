public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int lowest_price = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){

            int current_price = prices[i];
            int current_profit = current_price - lowest_price;

            if(current_profit > max_profit){
                max_profit = current_profit;
            }
            if(current_price < lowest_price){
                lowest_price = current_price;
            }

        }
        return max_profit;
    }
    public static void main(String[] args) {
        bestTimeToBuyAndSellStock solution = new bestTimeToBuyAndSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};  
        int profit = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);  
    }
}
