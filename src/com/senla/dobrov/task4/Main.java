package com.senla.dobrov.task4;

import com.senla.dobrov.utils.StringReader;
import com.senla.dobrov.utils.TextUtilities;;

/*
Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.

 */
public class Main {
    public static void main(String[] args){

        StringReader stringReader = new StringReader(System.in);
        System.out.println("Enter a sentence, separating the words with a space: ");
        String sentence = stringReader.ReadString().trim();
        System.out.println("Enter a word whose number of occurrences to count: ");
        String word = stringReader.ReadString().trim();

        int wordCount=TextUtilities.GetWordCountInText(word,sentence);
        System.out.println("Original sentence:" + sentence);
        System.out.println("Original word:" + word);
        System.out.println("Occurrences quantity  :" + wordCount);
    }
}
