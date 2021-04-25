package com.booleans.calendar.FRQ.Neil;

class Food{
    public String name;
    public int cost;

    public Food(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    public String toString(){
        return ("The name of the food is" + name + "\n" + " and it costs " + cost + "\n");
    }
}

class Drink extends Food{
    public int calories;

    public Drink(String name, int cost, int dacalories){
        super(name,cost);
        calories = dacalories;
    }
    @Override public String toString(){
        return(super.toString() + "this food is " + calories + " calories");
    }
}

public class Inheritance {
    public static void main(String args[]){
        Drink sc = new Drink("Gatorade",2,200);
        System.out.println(sc.toString());
    }
}
