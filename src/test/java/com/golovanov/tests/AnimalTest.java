package com.golovanov.tests;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Animal(1,"Тузик", "security",true);
        Animal bird = new Animal(1,"Гусь", "meal", true);
        Animal cat = new Animal(1,"Мурзик", "decorative", true);
        Animal horse = new Animal(1,"Граф", "worker", true);
        Animal mouse = new Animal(1,"Мики", " slacker", false);
    }
}
