package org.example.Seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
 * значений в данном массиве и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

public class S6Task1 {
    public ArrayList<Integer> createRandomArray(int size) {
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(0, 24));
        }
        return result;
    }

    public double countUniqueValues(ArrayList<Integer> inputArray) {
        Set<Integer> set = new HashSet<>(inputArray);
        return set.size() * 100.0 / inputArray.size();
    }



}
