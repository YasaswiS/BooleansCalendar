package com.booleans.calendar.FRQ.Neil;
import org.springframework.web.servlet.resource.CachingResourceResolver;
import java.sql.Driver;
import java.util.ArrayList;

public class Inheritance {
    public static class Car {
        private String brand;
        private String model;
        private int cost;
        public Car(String brand, String model, int cost) {
            this.brand = brand;
            this.model = model;
            this.cost = cost;
        }
        public String getModel() {
            return model;
        }
        public String getBrand() {
            return brand;
        }
        public int getCost() {
            return cost;
        }
        public String returnabout() {
            return "Brand: " + brand + ", Model: " + model + ", Cost: " + cost;
        }
    }
    public static class BMW extends Car{
        public BMW (String model, int cost) {super("BMW", model, cost);}
    }
    public static class Audi extends Car{
        public Audi (String model, int cost) {super("Audi", model, cost);}
    }

    public static void main(String[] args){
        ArrayList<Car> Cars = new ArrayList<>();

        BMW BMW = new BMW("I8", 148000);
        Cars.add(BMW);

        Audi Audi = new Audi("R8", 142000);
        Cars.add(Audi);

        Cars.forEach((car -> {
            System.out.println(car.returnabout());
        }));
    }

}
