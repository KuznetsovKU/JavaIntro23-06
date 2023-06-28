package org.example.Seminar3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

public class S3Task2 {

    public HashMap<String, Integer> planetsDict(ArrayList<String> inputList) {
        HashMap<String, Integer> planets = new HashMap<>();
        for (String planet : inputList) {
            planets.put(planet, planets.getOrDefault(planet, 0) + 1);
        }
        return planets;
    }

    public void dictPrinter(HashMap<String, Integer> inputDict) {
        for (String key : inputDict.keySet()) {
            System.out.println(key + ": " + inputDict.get(key));
        }
    }

    public Set<String> getUniqueElements(ArrayList<String> inputList) {
        return new HashSet<>(inputList);
    }
}
