package com.senla.dobrov.utils;

import java.io.InputStream;
import java.util.Scanner;

public class StringReader {

    private Scanner scanner;

    public StringReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public String ReadString() {
        String text = this.scanner.nextLine();
        return text;
    }
}
