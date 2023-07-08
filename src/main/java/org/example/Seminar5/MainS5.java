package org.example.Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MainS5 {
    public static void main(String[] args) {
//        Map<String, String > passportData = new HashMap<>();
//        passportData.put("123456", "Ivanov");
//        passportData.put("321456", "Vasilev");
//        passportData.put("234561", "Petrova");
//        passportData.put("234432", "Ivanov");
//        passportData.put("654321", "Petrova");
//        passportData.put("345678", "Ivanov");
//
//        String requestedLastName = "Ivanov";
//
//        for (String key: passportData.keySet()) {
//            if (passportData.get(key).equalsIgnoreCase(requestedLastName)) {
//                System.out.println(key + " last_name is " + passportData.get(key));
//            }
//        }
//
//        for (Map.Entry<String, String> entry: passportData.entrySet()) {
//            String passportNumber = entry.getKey();
//            String lastName = entry.getValue();
//            if (lastName.equalsIgnoreCase(requestedLastName)) {
//                System.out.println(passportNumber + " last_name is " + lastName);
//            }
//        }

//        S5Task1 s5Task1 = new S5Task1();
//        System.out.println(s5Task1.checkIsomorphism("note", "c o de"));
//        System.out.println(s5Task1.checkIsomorphism2("note", "c o de"));

        S5Task2 s5Task2 = new S5Task2();
        String[] myArray = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        for (String el: myArray) {
            System.out.println(s5Task2.checkBrackets(el));
        }
    }
}
