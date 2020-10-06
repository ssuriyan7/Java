package com.ssuriyan.java.programs.crackingthecodinginterview;

public class URLify {

    /**
     * 
     * @param input string to be urlified
     * @return URL
     */
    public static String urlify(String input) {
        return input.trim().replaceAll("[ ]{1,}", "%20");
    }
}
