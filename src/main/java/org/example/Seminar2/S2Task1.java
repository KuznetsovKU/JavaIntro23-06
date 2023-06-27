package org.example.Seminar2;

public class S2Task1 {

    public String buildString(int length, char char1, char char2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i += 2) {
            result.append(char1);
            result.append(char2);
        }
        return result.toString();
    }

}
