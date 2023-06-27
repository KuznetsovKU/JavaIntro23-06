package org.example.Homework1to3.Calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorService {

    Calculator calculator = new Calculator();

    private String getTask() {
        System.out.print("Please enter a task (exp: 1 + 2): ");
        return new Scanner(System.in).nextLine();
    }

    public Integer getSolution() {
        String[] operations = new String[]{"+", "-"};
        Integer result = null;

        String[] task = getTask().split(" ");

        Logger logger = Logger.getLogger(CalculatorService.class.getName());
        try {
            FileHandler fh = new FileHandler("Calculator_log.txt");
            logger.addHandler(fh);
            SimpleFormatter simpForm = new SimpleFormatter();
            fh.setFormatter(simpForm);

            if (task.length == 3) logger.info("There are correct argument amount.");
            else logger.info("There are NOT correct argument amount.");

            String operation = task[1];
            if (Arrays.asList(operations).contains(operation)) logger.info("There are correct operation type: " + "\"" + operation + "\"");
            else logger.info("There are NOT correct operation type: " + task[1]);

            Integer value1 = isInteger(task[0]);
            Integer value2 = isInteger(task[2]);
            if (value1 != null && value2 != null) {
                logger.info("There are correct numbers: " + value1 + ", " + value2);
                switch (operation) {
                    case "+" -> {
                        result = calculator.sum(value1, value2);
                        logger.info("Result = " + result);
                    }
                    case "-" -> {
                        result = calculator.subtraction(value1, value2);
                        logger.info("Result = " + result);
                    }
                }
            }
            else logger.info("There are NOT correct numbers: " + value1 + ", " + value2);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    private Integer isInteger(String inputValue){
        Integer result = null;
        try {
            result =  Integer.parseInt(inputValue);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
