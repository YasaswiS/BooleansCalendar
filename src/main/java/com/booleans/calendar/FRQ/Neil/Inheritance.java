package com.booleans.calendar.FRQ.Neil;
import org.springframework.web.servlet.resource.CachingResourceResolver;
import java.sql.Driver;
import java.util.ArrayList;

public class Inheritance {
    public static class Person {
        private String name;
        private int grade;
        private int age;
        public Person(String name, int grade, int age) {
            this.name = name;
            this.grade = grade;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getGrade() {
            return grade;
        }
        public int getAge() {
            return age;
        }
        public String returnabout() {
            return "Name: " + name + ", Grade: " + grade + ", Age: " + age;
        }
    }
    public static class Neil extends Person{
        public Neil (int grade, int age) {super("Neil Sahai", grade, age);}
    }
    public static class YasaswiS extends Person{
        public YasaswiS (int grade, int age) {super("Yasaswi Singamneni", grade, age);}
    }

    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();

        Person person3 = new Person("Eyaad Mir", 11);
        people.add(person3);

        Person person4 = new Person("Praveen Natarajan", 10);
        people.add(person4);

        people.forEach((person -> {
            System.out.println(people.returnabout());
        }));
    }

}
