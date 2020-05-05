package com.senla.dobrov.task3;

import com.senla.dobrov.utils.StringReader;
import com.senla.dobrov.utils.TextUtilities;

import java.util.Arrays;

/*
Создать программу, которая будет:
подсчитывать количество слов в предложении
выводить их в отсортированном виде
делать первую букву каждого слова заглавной.
Предложение вводится вручную. (Разделитель пробел (“ ”)).

 */
public class Main {
    public static void main(String[] args) {

        StringReader stringReader = new StringReader(System.in);
        System.out.println("Enter a sentence, separating the words with a space: ");
        String sentence = stringReader.ReadString().trim();

        String[] Words = TextUtilities.SplitTextIntoWords(sentence);
        int wordsCount = Words.length;

        String[] UpperLetterWords = new String[wordsCount];
        for (int i = 0; i < Words.length; i++) {
            UpperLetterWords[i] = TextUtilities.WordToUpperLetter(Words[i]);
        }
        Arrays.sort(UpperLetterWords);


        System.out.println("Original sentence:\n" + sentence);
        System.out.println("Alphabetically sorted sentence, capitalized first letter:");
        for (String word : UpperLetterWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Letters quantity - " + wordsCount);
    }
}
