package org.example.Seminar1;

/**
 * Задание №5 (доп)
 * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

public class Task5 {
    String str = "Добро пожаловать на курс по Java";

    public void textReverse(String text) {
        String[] wordArray = text.replaceAll("\\s+", " ").trim().split(" ");
        for (int i = wordArray.length - 1; i >= 0; i--) {
            System.out.print(wordArray[i] + " ");
        }
    }

    public void textReverseSB(String text) {
        String[] wordArray = text.replaceAll("\\s+", " ").trim().split(" ");
        StringBuilder outputText = new StringBuilder();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            outputText.append(wordArray[i]).append(" ");

        }
        System.out.println(outputText);
    }
}
