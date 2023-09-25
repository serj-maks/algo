package org.serjmaks.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStocksTest {

    @Test
    public void run() {
        int[] prices = {3,4,5,6,5};
        int[] prices2 = {7,6,5,4,3};
        int[] prices3 = {0};

        BestTimeToBuyAndSellStocks best = new BestTimeToBuyAndSellStocks();
        int expected = 0;
        int actual = best.run(prices2);

        assertEquals(expected, actual);
    }

//    @ParameterizedTest
//    @MethodSource("arguments")
//    public void newRun(int[] prices, int expected) {
//        BestTimeToBuyAndSellStocks best = new BestTimeToBuyAndSellStocks();
//        assertEquals(expected, best.run(prices));
//    }
//
//    private static Stream<Arguments> arguments () {
//        return Stream.of(
//                Arguments.of(new int[]{1,2,4,5}, 4),
//                Arguments.of(new int[]{0}, 0),
//                Arguments.of(new int[]{2,4,6,8}, 6)
//        );
//    }
}