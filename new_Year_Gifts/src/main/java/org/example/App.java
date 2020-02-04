package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args ) {
        Scanner scr= new Scanner(System.in);

        System.out.println("Enter the name & age of Child 1");
        String name = scr.next();
        int age = scr.nextInt();
        Child child1 = new Child(name,age);

        System.out.println("Enter the name & age of Child 2");
        name = scr.next();
        age = scr.nextInt();
        Child child2 = new Child(name,age);

        System.out.println("Enter the name, weight, price and calories of Cake 1");
        name = scr.next();
        int weight = scr.nextInt();
        int price = scr.nextInt();
        int calories = scr.nextInt();
        Sweets cake1 = new Cake(name, weight, price, calories);

        System.out.println("Enter the name, weight, price and calories of Cake 2");
        name = scr.next();
        weight = scr.nextInt();
        price = scr.nextInt();
        calories = scr.nextInt();
        Sweets cake2 = new Cake(name, weight, price, calories);


        System.out.println("Enter the name, weight, price and calories of Doughnut 1");
        name = scr.next();
        weight = scr.nextInt();
        price = scr.nextInt();
        calories = scr.nextInt();
        Sweets dough1 = new Doughnuts(name, weight, price, calories);

        System.out.println("Enter the name, weight, price and calories of Doughnut 2");
        name = scr.next();
        weight = scr.nextInt();
        price = scr.nextInt();
        calories = scr.nextInt();
        Sweets dough2 = new Doughnuts(name, weight, price, calories);


        System.out.println("Enter the name, weight, price and calories of Chocolate 1");
        name = scr.next();
         weight = scr.nextInt();
         price = scr.nextInt();
         calories = scr.nextInt();
        Sweets chocolate1 = new Chocolate(name, weight, price, calories);

        System.out.println("Enter the name, weight, price and calories of Chocolate 2");
        name = scr.next();
        weight = scr.nextInt();
        price = scr.nextInt();
        calories = scr.nextInt();
        Sweets chocolate2 = new Chocolate(name, weight, price, calories);

        Vector<Sweets> ch1 = new Vector<Sweets>();
        ch1.add(chocolate1);
        ch1.add(cake1);
        ch1.add(dough1);

        Vector<Sweets> ch2 = new Vector<>();
        ch2.add(chocolate2);
        ch2.add(cake2);
        ch2.add(dough2);

        Gifts gift1 = new Gifts(ch1,"Happy New Year");
        Gifts gift2 = new Gifts(ch2,"Lots of Wishes");

        child1.give(gift1,child1);
        child2.give(gift2,child2);

        child1.show();
        child2.show();
    }
}
