package org.example.Homework4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
 * 1) Умножьте два числа и верните произведение в виде связанного списка.
 * 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
 */

public class Hw4Ex1to2 {
        public LinkedList<Character> solution1(Deque<String> firstNum, Deque<String> secondNum) {
            LinkedList<Character> result = new LinkedList<>();
            char[] mult = String.valueOf((parseFromDeque(firstNum) * parseFromDeque(secondNum))).toCharArray();
            for (char c: mult) {
                result.add(c);
            }
            return result;
        }

    public LinkedList<Character> solution2(Deque<String> firstNum, Deque<String> secondNum) {
        LinkedList<Character> result = new LinkedList<>();
        char[] sum = String.valueOf((parseFromDeque(firstNum) + parseFromDeque(secondNum))).toCharArray();
        for (char c: sum) {
            result.add(c);
        }
        return result;
    }

        private Integer parseFromDeque(Deque<String> inputValue) {
            StringBuilder value = new StringBuilder();
            while (!inputValue.isEmpty()) {
                value.append(inputValue.pollLast());
            }
            return Integer.parseInt(value.toString());
        }
}
