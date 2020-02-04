package org.example;

public abstract class Sweets implements Comparable<Sweets> {
    String name;
    int weight;
    int rate;
    int cal;

    public Sweets(String name, int weight, int price, int calories){
        this.name = name;
        this.weight = weight;
        this.rate = price;
        this.cal = calories;
    }

    public int compareTo(Sweets s1){
        return this.cal-s1.cal;
    }

    public String toString(){
        return name;
    }
}
