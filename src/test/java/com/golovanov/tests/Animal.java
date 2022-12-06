package com.golovanov.tests;

public class Animal {
int id;
String name;
String neededFor;
boolean benefit;


    public Animal(int id, String name, String neededFor, boolean benefit) {
        this.id = id;
        this.name = name;
        this.neededFor = neededFor;
        this.benefit = benefit;
    }

    int tochangeid (int newid){
        int result=id=newid;
        return result;
    }


}
