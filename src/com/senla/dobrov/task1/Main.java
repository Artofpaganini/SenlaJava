package com.senla.dobrov.task1;

import com.senla.dobrov.utils.IntegerReader;
import com.senla.dobrov.utils.IntegerUtilities;
/*
Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным, простым или составным.
 Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class Main {
    public static void main(String[] args) {
        IntegerReader integerReader = new IntegerReader(System.in);
        System.out.print("Input integer Number: ");
        int number = integerReader.ReadInt();

        if (IntegerUtilities.IsEven(number)) {
            System.out.print("Number " + number + " - is even.\n");
        } else {
            System.out.print("Number " + number + " - is odd.\n");
        }

        if (IntegerUtilities.IsPrime(number)) {
            System.out.print("Number " + number + " - is simple.\n");
        } else if (IntegerUtilities.IsComposite(number)) {
            System.out.print("Number " + number + " - is compound.\n");
        } else {
            System.out.print("Number " + number + " is neither simple nor compound.\n");
        }
    }
}

