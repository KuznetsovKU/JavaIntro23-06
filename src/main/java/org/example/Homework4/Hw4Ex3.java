package org.example.Homework4;

import java.util.Stack;

/**
 * 3)*Реализовать стэк с помощью массива. Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */

public class Hw4Ex3 {

    public void solution(String[] inputArray) {
        Stack<String> someStack = new Stack<>();
        if (someStack.isEmpty()) {
            System.out.println("current stack size = stackIsEmpty");
        }
        for (String el: inputArray) {
            System.out.println("push element " + el + " in stack");
            someStack.push(el);
        }
        System.out.println("current stack size = " + someStack.size());
        System.out.println("current last element is: " + someStack.pop());
        System.out.println("lets delete it...");
        System.out.println("now current last element is: " + someStack.peek());
        System.out.println("and current stack size = " + someStack.size());
        
    }
}
