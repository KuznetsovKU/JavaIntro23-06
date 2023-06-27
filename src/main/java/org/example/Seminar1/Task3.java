package org.example.Seminar1;

/**
 * Задание №3
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

public class Task3 {
    public int[] specialSorting(int[] inputArray, int key) {
        int[] outputArray = new int[inputArray.length];
        int lastIndex = inputArray.length - 1;
        for (int i = 0; i < outputArray.length; i++) {
            if (outputArray[i] == 0) {
                for (int k : inputArray) {
                    if (k != key) {
                        outputArray[i] = k;
                        i++;
                    } else {
                        outputArray[lastIndex] = k;
                        lastIndex--;
                    }
                }
            }
        }
        return outputArray;
    }

    public int[] specialSorting2(int[] inputArray, int key) {
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length; j++) {
                if (inputArray[j - 1] == key) {
                    int tmp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = tmp;
                }
            }
        }
        return inputArray;
    }
}
