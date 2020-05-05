package com.senla.dobrov.utils;

import java.util.regex.Pattern;

public class TextUtilities {
    public static String WordToUpperLetter(String word) {
        word = word.trim();
        String firstLetter = word.substring(0, 1).toUpperCase();
        String newWord = firstLetter + word.substring(1);
        return newWord;
    }

    public static String[] SplitTextIntoWords(String text) {
        Pattern patternWordDivider = Pattern.compile("\\s*(\\s|,|!|\\?|\\.)\\s*");
        String[] Words = patternWordDivider.split(text);
        return Words;
    }

    public static int GetWordCountInText(String wordToCount, String text) {
        String[] Words = TextUtilities.SplitTextIntoWords(text);
        int count = 0;
        for (String word : Words) {
            if (wordToCount.toUpperCase().equals(word.toUpperCase())) count++;
        }
        return count;
    }
}
