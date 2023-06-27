package org.example.Seminar2;

public class S2Task2 {
    public String zipString(String inputString) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputString.charAt(i - 1)) {
                counter++;
            } else {
                result.append(inputString.charAt(i - 1));
                if (counter > 1) result.append(counter);
                counter = 1;
            }
        }
        if (inputString.charAt(inputString.length() - 1) != result.charAt(result.length() - 2)) {
            result.append(inputString.charAt(inputString.length() - 1));
            if (counter > 1) result.append(counter);
        }
        return result.toString();
    }

}
