package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void run() {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        BinarySearch binarySearch = new BinarySearch();

        int expected = 4;
        int actual = binarySearch.run(nums, target);

        assertEquals(expected, actual);
    }
}