package org.example.Seminar1;

/**
 * Задание №4
 * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 */

public class Task4 {

    public String findMaxWord(String[] inputArray, String prefix) {
        String result = "";
        for (String word : inputArray) {
            if (word.length() > result.length() && word.startsWith(prefix)) {
                result = word;
            }
        }
        return result;
    }
}
