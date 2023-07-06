package org.example.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainS4 {
    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//        List<Integer> myList1 = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            myList1.add(i);
//        }
//        long endTime = System.nanoTime();
//        long myList1Time = endTime - startTime;
//
//        startTime = System.nanoTime();
//        List<Integer> myList2 = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//            myList2.add(i);
//        }
//        endTime = System.nanoTime();
//        long myList2Time = endTime - startTime;
//
//        System.out.println(myList1Time);
//        System.out.println();
//        System.out.println(myList2Time);

        List<String> myList3 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myList3.add("some_data");
        }
        System.out.println(myList3);

        System.out.print("Введите строку типа \"text~num\": ");
        String someString = new Scanner(System.in).nextLine();
        S4Task1 s4Task1 = new S4Task1();
        s4Task1.solution(someString, myList3);
    }
}
