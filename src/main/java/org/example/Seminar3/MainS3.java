package org.example.Seminar3;


import java.util.*;

public class MainS3 {
    public static void main(String[] args) {
//        S3Task1 s3Task1 = new S3Task1();
//        System.out.println(s3Task1.arrayFiller(10));

//        S3Task2 s3Task2 = new S3Task2();
//        ArrayList<String> planetsList = new ArrayList<>(Arrays.asList("Mars", "Venus", "Jupiter", "Saturn", "Earth",
//                "Mercury", "Neptune", "Venus", "Jupiter", "Saturn", "Earth", "Mercury"));
//        s3Task2.dictPrinter(s3Task2.planetsDict(planetsList));
//        System.out.println(s3Task2.getUniqueElements(planetsList));

        S3Task3 s3Task3 = new S3Task3();
        ArrayList<Object> myList = new ArrayList<>(Arrays.asList("Мама", 2, "мыла", 8, "раму", 3, 5, "долго", "мыла", 4));
        System.out.println(s3Task3.intRemover(myList));

    }
}
