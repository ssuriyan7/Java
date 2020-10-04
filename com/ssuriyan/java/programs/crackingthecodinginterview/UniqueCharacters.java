package com.ssuriyan.java.programs.crackingthecodinginterview;

import java.util.Arrays;

public class UniqueCharacters {

    /**
     * function to check if the input string contains all unique characters
     * 
     * @param input string to check
     * @return boolean value indicating if the input string contains all unique
     *         characters
     */
    public static boolean checkUniqueChars(String input) {

        if (input == null)
            return false;

        if (input == "" || input.length() == 1)
            return true;

        char chars[] = input.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1])
                return false;
        }
        return true;
    }
}