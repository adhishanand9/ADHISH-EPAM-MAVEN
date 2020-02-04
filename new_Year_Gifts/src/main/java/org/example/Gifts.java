package org.example;
import java.util.*;

public class Gifts {
    Vector<Sweets> s;
    String message;
    int Weight;

    public Gifts(Vector<Sweets> s, String msg){
        this.s = s;
        this.message = msg;
    }
    public int totalWeight(){
        for(Sweets i:s){
            Weight+= i.weight;
        }

        return Weight;
    }
}
