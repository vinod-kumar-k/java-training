package com.simplilearn.demos;

import java.util.HashMap;
import java.util.Map;

public class MapEaxmple {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Name 1", 25);
        ages.put("Name 2", 21);
        ages.put("Name 3", 27);
        ages.put("Name 2", 32);

        System.out.println(ages);
    }
}
