package com.golovanov.tests;

import java.beans.DefaultPersistenceDelegate;
public class AnimalTest {

    private static String revenue;
    public static void main(String[] args) {
        Animal dog = new Animal(1, "Тузик", "security", 5, 0, true);
        Animal bird = new Animal(2, "Гусь", "meal", 3, 0, true);
        Animal cat = new Animal(3, "Васька", "decorative", 4, 1, true);
        Animal horse = new Animal(4, "Граф", "worker", 150, 0, true);
        Animal mouse = new Animal(5, "Микки", " slacker", 1, 9, false);

        dog.toFeed(1);
        System.out.println("Теперь " + dog.name + " весит  " + dog.weight + " кг");
        bird.toFeed(0);
        System.out.println("Теперь " + bird.name + " весит  " + bird.weight + " кг");
        mouse.toFeed(1);
        System.out.println("Мышь осталась в весе " + mouse.weight + " кг");
        System.out.println();
        System.out.println("Васька, иди ловить мышей!");

        for (int i = cat.trick; i <= mouse.trick+1; i++) {
          toCatchMouse (mouse, cat);
            cat.trick++;
        }
    }
   static void toCatchMouse(Animal animal1, Animal animal2) {
        if (animal1.trick >= animal2.trick) {
            System.out.println( "Опять неудача....");
        } else {
            System.out.println("Ура! Мышь поймана!");
        }
    }
}

