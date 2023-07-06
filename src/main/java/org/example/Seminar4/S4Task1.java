package org.example.Seminar4;

import java.util.LinkedList;
import java.util.List;

/**
 * Реализовать консольное приложение, которое принимает от пользователя строку вида
 * text~num
 * 1. Нужно "распилить" строку по "~", и сохранить text в связанный список на позицию num.
 * 2. Если введено print~num, вывести строку из позиции num в связанном списке и удалить ее из списка.
 */

public class S4Task1 {
    public void solution(String inputText, List<String> inputList) {
        String[] textArr = inputText.split("~");
        if (textArr[0].equalsIgnoreCase("print")) {
            System.out.println(inputList.get(Integer.parseInt(textArr[1])));
            inputList.remove(Integer.parseInt(textArr[1]));
        } else {
            inputList.add(Integer.parseInt(textArr[1]), textArr[0]);
        }
        System.out.println(inputList);
    }

}
