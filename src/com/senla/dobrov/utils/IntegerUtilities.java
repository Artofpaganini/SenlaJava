package com.senla.dobrov.utils;

public class IntegerUtilities {
    public static boolean IsEven(int initialNumber) {
        return (initialNumber % 2 == 0);
    }

    public static boolean IsPrime(int initialNumber) {
        if (initialNumber < 2) return false;
        int initialNumberSquareRoot = (int) Math.sqrt((double) initialNumber);

        for (int i = 2; i <= initialNumberSquareRoot; i++) {
            if (initialNumber % i == 0) return false;
        }
        return true;
    }

    public static boolean IsComposite(int initialNumber) {
        if (initialNumber < 2) return false;
        int initialNumberSquareRoot = (int) Math.sqrt((double) initialNumber);

        for (int i = 2; i <= initialNumberSquareRoot; i++) {
            if (initialNumber % i == 0) return true;
        }
        return false;
    }

    public static int GreatestCommonDivisor(int initialNumber1, int initialNumber2) {
        //        Euclidean algorithm
        int a = Math.abs(initialNumber1),
                b = Math.abs(initialNumber2);
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a + b);
    }

    public static int LeastCommonMultiple(int initialNumber1, int initialNumber2) {
        int a = Math.abs(initialNumber1),
                b = Math.abs(initialNumber2);
        return (a * b) / GreatestCommonDivisor(a, b);
    }

    public static boolean IsPalindrome(int initialNumber) {
        int number = initialNumber;
        int reverseNumber = 0;

        while (number != 0) {
            int residue = number % 10;
            reverseNumber = reverseNumber * 10 + residue;
            number = number / 10;
        }

        return initialNumber == reverseNumber;
    }
}
