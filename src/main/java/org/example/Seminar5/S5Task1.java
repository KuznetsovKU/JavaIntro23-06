package org.example.Seminar5;

import java.util.*;

/**
 * Даны 2 строки. Написать метод, который вернет true, если эти строки являются изоморфными, и false, если нет.
 * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом:
 * 1 - повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например: add - egg)
 * 2 - буква может не меняться, а остаться такой же. (Например: note - code)
 */

public class S5Task1 {
    public boolean checkIsomorphism(String value1, String value2) {
        long startTime = System.nanoTime();
        value1 = value1.replaceAll(" ", "");
        value2 = value2.replaceAll(" ", "");
        if (value1.length() != value2.length()) return false;
        Map<Character, LinkedList<Integer>> transformedValue1 = transformStringToLHM(value1);
        Map<Character, LinkedList<Integer>> transformedValue2 = transformStringToLHM(value2);
        if (transformedValue1.keySet().size() != transformedValue2.keySet().size()) return false;
        for (Character key1: transformedValue1.keySet()) {
            boolean isContained = false;
            for (Character key2: transformedValue2.keySet()) {
                if (transformedValue1.get(key1).equals(transformedValue2.get(key2))) isContained = true;
            }
            if (!isContained) return false;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return true;
    }

    private Map<Character, LinkedList<Integer>> transformStringToLHM(String inputValue) {
        Map<Character, LinkedList<Integer>> result = new LinkedHashMap<>(inputValue.length());
        for (int i = 0; i < inputValue.length(); i++) {
            char currentKey = inputValue.charAt(i);
            result.putIfAbsent(currentKey, new LinkedList<>());
            result.get(currentKey).add(i);
        }
        return result;
    }

    public boolean checkIsomorphism2(String value1, String value2) {
        long startTime = System.nanoTime();
        value1 = value1.replaceAll(" ", "");
        value2 = value2.replaceAll(" ", "");
        if (value1.length() != value2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> usedCharacters = new HashSet<>();
        for (int i = 0; i < value1.length(); i++) {
            char symbol1 = value1.charAt(i);
            char symbol2 = value2.charAt(i);
            if (map.containsKey(symbol1)) {
                if (map.get(symbol1) != symbol2) return false;
            } else {
                if (usedCharacters.contains(symbol2)) return false;
                map.put(symbol1, symbol2);
                usedCharacters.add(symbol2);
            }
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return true;
    }
}
