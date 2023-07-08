package org.example.Seminar5;

import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * 1. a+(d*3) - true
 * 2. [a+(1*3) - false
 * 3. [6+(3*3)] - true
 * 4. {a}[+]{(d*3)} - true
 * 5. <{a}+{(d*3)}> - true
 * 6. {a+]}{(d*3)} - false
 */

public class S5Task2 {
    public boolean checkBrackets(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char symbol: inputString.toCharArray()) {
            if (isOpeningBracket(symbol)) stack.push(symbol);
            else if (isClosingBracket(symbol)) {
                if (stack.isEmpty() || !isMatchingBrackets(stack.pop(), symbol)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{' || c == '<';
    }

    private boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}' || c == '>';
    }

    private boolean isMatchingBrackets(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}') ||
                (open == '<' && close == '>');
    }

}
