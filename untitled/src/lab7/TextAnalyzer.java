package lab7;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst:");
        String text = scanner.nextLine();

        analyzeText(text);

        scanner.close();
    }

    public static void analyzeText(String text) {
        int totalCharacters = text.length();
        int vowelCount = 0;
        int consonantCount = 0;
        int whitespaceCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isWhitespace(c)) {
                whitespaceCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Podany tekst \"" + text + "\" zawiera:");
        System.out.println(totalCharacters + " liter, w tym " + vowelCount + " samogłosek oraz " + consonantCount + " spółgłosek");
        System.out.println(whitespaceCount + " białych znaków");
        System.out.println(digitCount + " liczb");
        System.out.println(otherCount + " innych znaków");
    }

}
