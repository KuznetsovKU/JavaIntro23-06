package org.example.Seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Задание №1
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 *
 * Задание №1+
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

public class Task1 {

    public String getName() {
        System.out.print("Назовите свое имя: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public void greetingsTimed(String name) {
        String[] periods = new String[]{"Доброе утро, ", "Добрый день, ", "Добрый вечер, ", "Доброй ночи, "};
        int currentHour = LocalDateTime.now().getHour();
        if (currentHour >= 5 && currentHour < 12) System.out.println(periods[0] + name + "!");
        if (currentHour >= 12 && currentHour < 18) System.out.println(periods[1] + name + "!");
        if (currentHour >= 18 && currentHour < 23) System.out.println(periods[2] + name + "!");
        if (currentHour >= 23 || currentHour < 5) System.out.println(periods[3] + name + "!");
    }
}
