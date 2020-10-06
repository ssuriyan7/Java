package com.ssuriyan.java.programs;

import java.util.*;

public class CharacterCountMap {

    public static Map<Character, Integer> getCharacterCountMap(String input) {

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {

            char curr = input.charAt(i);
            if (charMap.containsKey(curr)) {
                charMap.compute(curr, (key, val) -> val + 1);
            } else {
                charMap.put(curr, 1);
            }

        }

        return charMap;
    }
}
