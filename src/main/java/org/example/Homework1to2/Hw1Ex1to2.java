package org.example.Homework1to2;

public class Hw1Ex1to2 {
    public int triangleNumber(int num) {
        return (num * (num + 1)) / 2;
    }

    public int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <=num ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void simpleNumPrinter(int border) {
        for (int i = 0; i < border; i++) {
            if (isSimpleNum(i)) System.out.print(i + " ");
        }
    }

    private boolean isSimpleNum(int num) {
        if (num <= 1 && num >= -1) return false;
        if (num <= 3 && num >= -3) return true;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
