package org.example.Homework1to3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Пусть дан произвольный список целых чисел.
 *
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */

public class Hw3 {

    public int getMinValue(ArrayList<Integer> inputList) {
        int result = inputList.get(0);
        for (int element : inputList) {
            if (element < result) result = element;
        }
        return result;
    }

    public int getMaxValue(ArrayList<Integer> inputList) {
        int result = inputList.get(0);
        for (int element : inputList) {
            if (element > result) result = element;
        }
        return result;
    }

    public double getAverageValue(ArrayList<Integer> inputList) {
        double sum = 0;
        for (int element : inputList) {
            sum += element;
        }
        return sum / inputList.size();
    }

    public ArrayList<Integer> deleteAllEvenNumbers(ArrayList<Integer> inputList) {
        Iterator<Integer> iterator = inputList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 0) iterator.remove();
        }
        return inputList;
    }

}
