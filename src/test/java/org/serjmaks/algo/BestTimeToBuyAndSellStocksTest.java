package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStocksTest {

    @Test
    public void run() {
        int[] prices = {1,2,3,4,5};

        BestTimeToBuyAndSellStocks best = new BestTimeToBuyAndSellStocks();
        int expected = 4;
        int actual = best.run(prices);

        assertEquals(expected, actual);
    }

}