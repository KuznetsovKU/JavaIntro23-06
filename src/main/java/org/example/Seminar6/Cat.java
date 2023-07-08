package org.example.Seminar6;

import java.util.List;

/**
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
public class Cat {
    private String color;
    private String breed;
    private String name;
    private double weight;
    private int age;
    private boolean gender;
    private List<String> vaccines;

    public Cat(String color, String breed, String name, double weight, int age, boolean gender, List<String> vaccines) {
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.vaccines = vaccines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public List<String> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<String> vaccines) {
        this.vaccines = vaccines;
    }

    public void vaccinate(String vaccine) {
        this.vaccines.add(vaccine);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", vaccines=" + vaccines +
                '}';
    }
}
