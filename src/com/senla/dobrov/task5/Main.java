package com.senla.dobrov.task5;

import com.senla.dobrov.utils.IntegerReader;
import com.senla.dobrov.utils.IntegerUtilities;

/*
Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности N вводится вручную и не должна превышать 100.
 */
public class Main {
    public static void main(String[] args) {

        IntegerReader numberReader = new IntegerReader(System.in);
        int minSequenceLength = 1, maxSequenceLength = 100;

        System.out.printf("Enter a sequence with length (%d;%d]:\n",
                minSequenceLength, maxSequenceLength);

        int sequenceLength = numberReader.ReadInt();

        if (sequenceLength < minSequenceLength || sequenceLength > maxSequenceLength) {
            System.out.printf("The length of the sequence is beyond the range of possible values.: (%d,%d]\n",
                    minSequenceLength, maxSequenceLength);
        } else {
            System.out.printf("Palindrome numbers on the interval [%d,%d]:\n",
                    0, sequenceLength);
            for (int i = 0; i <= sequenceLength; i++) {
                if (IntegerUtilities.IsPalindrome(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
