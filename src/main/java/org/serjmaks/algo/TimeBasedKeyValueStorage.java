package org.serjmaks.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStorage {

    Map<String, TreeMap<Integer, String>> map;

    public TimeBasedKeyValueStorage() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> timeMap = map.get(key);
        timeMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> timeMap = map.get(key);
        Integer prevTime = timeMap.floorKey(timestamp);
        if (prevTime == null) {
            return "";
        } else {
            return timeMap.get(prevTime);
        }
    }
}
