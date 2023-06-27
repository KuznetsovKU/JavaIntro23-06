package org.example.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */
public class S3Task1 {

    public ArrayList<Integer> arrayFiller(int size) {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(1, 50));
        }
        Collections.sort(result);
        return result;
    }
}
