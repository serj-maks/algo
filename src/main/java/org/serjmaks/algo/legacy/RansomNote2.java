package org.serjmaks.algo.legacy;

import java.util.HashMap;

public class RansomNote2 {

    // use HashMap
    public static boolean run(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) < 1) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
