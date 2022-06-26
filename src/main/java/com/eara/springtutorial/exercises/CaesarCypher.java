package com.eara.springtutorial.exercises;

import java.util.stream.Collectors;

public class CaesarCypher {

    public static void main(String[] args) {
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }

    public static String caesarCipher1(String plainText, int shift) {
        plainText = plainText.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encryptedText = "";
        String finalPlainText = plainText;
        String cc = plainText.codePoints()
                .mapToObj(c -> c)
                .map(i -> {
                    int charIndex = alphabet.indexOf(i);
                    int newIndex = (charIndex + shift) % 26;
                    char encryptedChar = alphabet.charAt(newIndex);

                    return encryptedText;
                })
                .collect(Collectors.joining());

        System.out.println(cc);
        return cc;
    }

    public static String caesarCipher(String plainText, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encryptedText = "";

        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
                if (Character.isUpperCase(plainText.charAt(i))) {
                    int charIndex = alphabet.indexOf(Character.toLowerCase(plainText.charAt(i)));
                    int newIndex = (charIndex + shift) % 26;
                    char encryptedChar = Character.toUpperCase(alphabet.charAt(newIndex));
                    encryptedText += encryptedChar;
                } else {
                    int charIndex = alphabet.indexOf(plainText.charAt(i));
                    int newIndex = (charIndex + shift) % 26;
                    char encryptedChar = alphabet.charAt(newIndex);
                    encryptedText += encryptedChar;
                }

            } else {
                encryptedText += plainText.charAt(i);
            }

        }

        return encryptedText;
    }

}
