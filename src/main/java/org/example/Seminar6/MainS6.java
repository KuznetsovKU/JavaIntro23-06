package org.example.Seminar6;

import java.util.*;

/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */

public class MainS6 {
    public static void main(String[] args) {
//        Set<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
//        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
//        Set<Integer> treeSet = new TreeSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
//
//        System.out.println(hashSet);
//        System.out.println(linkedHashSet);
//        System.out.println(treeSet);

//        S6Task1 s6Task1 = new S6Task1();
//        ArrayList<Integer> myArray = s6Task1.createRandomArray(1000);
//        System.out.println(myArray);
//        System.out.println("unique elements percent = " + s6Task1.countUniqueValues(myArray));

        Cat cat1 = new Cat("gray", "russian", "barsic", 4.6, 3, true,
                new ArrayList<>(List.of("vac1", "vac2", "vac3")));

        System.out.println(cat1.getName());
        cat1.setName("mursic");
        System.out.println(cat1.getName());
        cat1.vaccinate("vac4");
        System.out.println(cat1);
    }
}
