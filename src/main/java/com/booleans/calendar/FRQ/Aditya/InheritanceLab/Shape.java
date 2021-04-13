package com.booleans.calendar.FRQ.Aditya.InheritanceLab;

public class Shape
{
    String name;
    double area, perimeter;
    // constructor
    public Shape()
    {
        name = "undetermined";
        area = perimeter = 0;
    }
    // methods
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
