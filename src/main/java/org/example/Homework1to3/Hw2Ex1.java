package org.example.Homework1to3;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class Hw2Ex1 {

    public int[] bubbleSort(int[] inputArray) {
        Logger logger = Logger.getLogger(Hw2Ex1.class.getName());
        try {
            FileHandler fh = new FileHandler("Hw2Ex1_log.txt");
            logger.addHandler(fh);
            SimpleFormatter simpForm = new SimpleFormatter();
            fh.setFormatter(simpForm);
            for (int i = 0; i < inputArray.length; i++) {
                boolean flag = false;
                for (int j = 1; j < inputArray.length; j++) {
                    if (inputArray[j - 1] > inputArray[j]) {
                        int tmp = inputArray[j - 1];
                        inputArray[j - 1] = inputArray[j];
                        inputArray[j] = tmp;
                        flag = true;
                    }
                    logger.info(Arrays.toString(inputArray));
                }
                if (flag == false) break;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return inputArray;
    }

}
