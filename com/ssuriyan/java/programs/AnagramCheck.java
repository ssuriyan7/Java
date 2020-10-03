package com.ssuriyan.java.programs;

import java.util.*;

public class AnagramCheck {

    public static boolean checkAnagram(String string1, String string2) {

        // if they are not of equal length, its obvious
        if (string1.length() != string1.length())
            return false;

        // if their length is just 1, they would be equal to be anagram
        if (string1.length() == 1) 
            return string1.equals(string2);
        
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < string1.length(); i++) {

            char curr = string1.charAt(i);
            if (charMap.containsKey(curr)) {
                charMap.compute(curr, (key, val) -> val + 1);
            } else {
                charMap.put(curr, 1);
            }
        }

        for (int i = 0; i < string2.length(); i++) {

            char curr = string2.charAt(i);
            if (charMap.containsKey(curr)) {
                charMap.compute(curr, (key, val) -> val - 1);
                if (charMap.get(curr) == 0) 
                    charMap.remove(curr);
            } else {
                return false;
            }
        }
        if (charMap.isEmpty())
            return true;

        return false;
    }
}