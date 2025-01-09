package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AccountsMergeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(List<List<String>> accounts, List<List<String>> expected) {
        //TODO: add isAnyOrder
        assertEquals(expected, AccountsMerge.run(accounts));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com"), Arrays.asList("John","johnsmith@mail.com","john00@mail.com"), Arrays.asList("Mary","mary@mail.com"), Arrays.asList("John","johnnybravo@mail.com")), Arrays.asList(Arrays.asList("John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"), Arrays.asList("Mary","mary@mail.com"), Arrays.asList("John","johnnybravo@mail.com")))
        );
    }
}