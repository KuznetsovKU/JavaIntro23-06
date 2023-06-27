package org.example.Seminar1;

/**
 * Задание №2
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class Task2 {
    public int onesCounting(int[] inputArray) {
        int maxAmount = 0;
        int currentAmount = 0;
        for (int j : inputArray) {
            if (j == 1) currentAmount++;
            else {
                maxAmount = currentAmount;
                currentAmount = 0;
            }
        }
        maxAmount = currentAmount;
        return maxAmount;
    }
}
