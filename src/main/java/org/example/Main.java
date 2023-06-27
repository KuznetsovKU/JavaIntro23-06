package org.example;

import org.example.Homework1to3.Calculator.CalculatorService;
import org.example.Homework1to3.Hw2Ex1;
import org.example.Homework1to3.Hw3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        String name = task1.getName();
//        task1.greetings(name);
//        task1.greetingsTimed(name);

//        Task2 task2 = new Task2();
//        System.out.println(task2.onesCounting(new int[]{1, 1, 0, 1, 1, 1}));

//        Task3 task3 = new Task3();
//        System.out.println(Arrays.toString(task3.specialSorting(new int[]{3, 2, 3, 3, 4, 4, 4, 1, 3, 1, 1, 2, 3}, 3)));
//        System.out.println(Arrays.toString(task3.specialSorting2(new int[]{3, 2, 3, 3, 4, 4, 4, 1, 3, 1, 1, 2, 3}, 3)));

//        Task4 task4 = new Task4();
//        System.out.println(task4.findMaxWord(new String[]{"fly", "flower", "flow", "flight", "apple", "flip"}, "fl"));

//        Task5 task5 = new Task5();
//        task5.textReverse("Добро пожаловать на курс по Java");
//        System.out.println();
//        task5.textReverseSB("Добро пожаловать на курс по Java");

//        Hw1Ex1to2 hw1Ex1To3 = new Hw1Ex1to2();
//        System.out.println(hw1Ex1To3.triangleNumber(5));
//        System.out.println(hw1Ex1To3.factorial(5));
//        hw1Ex1To3.simpleNumPrinter(1000);

//        Calculator calculator = new Calculator();
//        System.out.println(calculator.sum(2, 3));
//        System.out.println(calculator.subtraction(7, 3));

//        Hw2Ex1 hw2Ex1 = new Hw2Ex1();
//        int[] res = hw2Ex1.bubbleSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9, 9, 9});
//        System.out.println(Arrays.toString(res));
//
//        CalculatorService cs = new  CalculatorService();
//        System.out.println(cs.getSolution());

        Hw3 hw3 = new Hw3();
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2, 4, 7, 3, 6, 3, 9, 4, 1, 6, 8, 9, 1));
        System.out.println(hw3.getMinValue(myList));
        System.out.println(hw3.getMaxValue(myList));
        System.out.println(hw3.getAverageValue(myList));
        System.out.println(hw3.deleteAllEvenNumbers(myList));
    }
}
