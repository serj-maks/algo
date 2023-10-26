package org.serjmaks.algo.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("arguments")
    //TODO: add test
    void run(int[] nums, List<List<Integer>> expected) {
    }

//    private static Stream<Arguments> arguments() {
//        List<List<Integer>> list = new ArrayList<>();
//        Integer[] nums1 = {1,2,3};
//        List<Integer> list1 = Arrays.asList(nums1);
//        list.add(list1);
//        return Stream.of(
//                Arguments.of(new LinkedList<List<Integer>>(Arrays.asList(new Integer[](1,2,3)), Arrays.asList(new Integer[](1,2,3))),
//                Arguments.of()
//        );
//    }
}
