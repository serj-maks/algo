package org.serjmaks.algo.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource("arguments")
    public void run(int[] prices, int expected) {
        assertEquals(expected, BestTimeToBuyAndSellStock.run(prices));
    }

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of(new int[]{1,2,4,5}, 4),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{2,4,6,8}, 6)
        );
    }
}
