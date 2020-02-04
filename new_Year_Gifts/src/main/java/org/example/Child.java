package org.example;

import java.util.*;

public class Child {
    String name;
    int age;
    Vector<Gifts> gifts = new Vector<Gifts>();

    public Child(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void give(Gifts gift, Child c){
        c.take(gift);
    }

    public void take(Gifts gift){
        gifts.add(gift);
    }

    public void show(){
        System.out.print(this.name + ": ");
        for(Gifts i:gifts){
            System.out.println(i.s + " Total Weight=" + i.totalWeight() + "g Message= " + i.message);
        }
    }

}
