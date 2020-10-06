package com.ssuriyan.java.programs;

import java.util.*;

public class CharacterCountMap {

    /**
     * This function will return a map of character:count of the input string. i.e
     * each key is a unique character in the string with value as the number of its
     * occurence
     * 
     * @param input Input String for which the character:count map is required
     * @return returns a HashMap of character:count of the input string
     */
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
