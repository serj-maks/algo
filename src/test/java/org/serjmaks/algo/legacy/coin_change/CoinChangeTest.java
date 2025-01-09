package org.serjmaks.algo.legacy.coin_change;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] coins, int amount, int expected) {
        assertEquals(expected, CoinChange.run(coins, amount));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5}, 11, 3),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1}, 0, 0)
        );
    }
}
