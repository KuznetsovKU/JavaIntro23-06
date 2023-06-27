package org.example.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Создать список типа ArrayList<Object>. Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */
public class S3Task3 {

    public ArrayList<Object> intRemover(ArrayList<Object> inputList) {
        Iterator<Object> iterator = inputList.iterator();
        while (iterator.hasNext()) {
            Object el = iterator.next();
            if (el instanceof Integer) {
                iterator.remove();
            }
        }
        return inputList;
    }
}
