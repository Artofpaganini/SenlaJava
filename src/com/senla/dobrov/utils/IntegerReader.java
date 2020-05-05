package com.senla.dobrov.utils;

import java.io.InputStream;
import java.util.Scanner;

public class IntegerReader {
    private Scanner scanner;

    public IntegerReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public int ReadInt() {

        while (true) {
            String inputText = this.scanner.nextLine();
            if (inputText.equals("exit")) {
                System.exit(-1);
            }

            try {
                int i = Integer.parseInt(inputText);
                return i;
            } catch (NumberFormatException var) {
                System.out.println("Error: " + var.getLocalizedMessage());
            }
        }
    }

}
