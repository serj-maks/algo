package org.serjmaks.algo.best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {

    public static int run(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for (int i = 0; i< prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }

        return sell;
    }
}
