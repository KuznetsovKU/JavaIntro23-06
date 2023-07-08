package org.example.Homework5;

import java.util.*;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами.
 * Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Hw5Ex1 {
    private static HashMap<String, ArrayList<String>> phoneBook = new LinkedHashMap<>();
    static {
        phoneBook.put("Adam", new ArrayList<>(List.of("89876543211", "1231231234", "9879879879")));
        phoneBook.put("John", new ArrayList<>(List.of("89876541122", "1234567890")));
        phoneBook.put("Eve", new ArrayList<>(List.of("89876542211", "9877890000", "1234123412", "6543654399")));
        phoneBook.put("Lucas", new ArrayList<>(List.of("89876541423")));
        phoneBook.put("Mary", new ArrayList<>(List.of("89876541234")));
    }

    public void addContactOrPhone(String name, String phoneNumber) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }


    public void showPhoneBook() {
        phoneBook = sortByPhonesAmount();
        for (String name: phoneBook.keySet()) {
            System.out.println("Name: " + name + " Phone numbers: " + phoneBook.get(name).toString());
        }
    }

    private HashMap<String, ArrayList<String>> sortByPhonesAmount() {
        HashMap<String, ArrayList<String>> sortedPhoneBook = new LinkedHashMap<>();
        ArrayList<Integer> numbersCount = new ArrayList<>(phoneBook.size());
        for (String name: phoneBook.keySet()) {
            numbersCount.add(phoneBook.get(name).size());
        }
        Collections.sort(numbersCount, Collections.reverseOrder());
        for (int amount: numbersCount) {
            for (String name: phoneBook.keySet()) {
                if (phoneBook.get(name).size() == amount) {
                    sortedPhoneBook.put(name, phoneBook.get(name));
                }
            }
        }
        return sortedPhoneBook;
    }
}
