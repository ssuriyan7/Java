package com.ssuriyan.java.programs.crackingthecodinginterview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.ssuriyan.java.programs.CharacterCountMap;

public class PermutationPalindrome {

    /**
     * Example: tact coa -> taco cat, atco cta.
     * 
     * @param input Input string that needs to be checked
     * @return boolean value indicating if any of input string's permutation is a
     *         palindrome.
     */
    public static boolean isPermutationPalindrome(String input) {

        String processed = input.trim().replaceAll("[ ]{1,}", "");
        Map<Character, Integer> charMap = CharacterCountMap.getCharacterCountMap(processed);
        Collection<Integer> values = charMap.values();
        if (processed.length() % 2 == 0) {
            for (int i : values) {
                if ((i % 2) != 0)
                    return false;
            }
        } else {
            boolean first = false;
            for (int i : values) {
                if ((i % 2) != 0) {
                    if (first != false)
                        return false;
                    first = true;
                }
            }
        }

        return true;
    }
}
