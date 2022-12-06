package com.golovanov.tests;

public class Animal {
    int id;
    String name;
    String neededFor;
    int weight;
    int trick;
    boolean benefit;

    public Animal(int id, String name, String neededFor, int weight, int trick, boolean benefit) {
        this.id = id;
        this.name = name;
        this.neededFor = neededFor;
        this.weight = weight;
        this.trick = trick;
        this.benefit = benefit;
    }
    int tochangeid(int newid) {
        int result = id = newid;
        return result;
    }
    int toFeed(int feed) {
        if (benefit == true) {
            weight += feed;
            System.out.println("Ты хорошо работал, поешь!" );
        } else {
            System.out.println("Ничего не получишь, бездельник!");
        }
        return weight;
        }
}

