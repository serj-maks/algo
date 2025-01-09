package org.serjmaks.algo.legacy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static int run(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }

        if (oddCount > 1) {
            return s.length() - oddCount + 1;
        }

        return s.length();
    }
}
