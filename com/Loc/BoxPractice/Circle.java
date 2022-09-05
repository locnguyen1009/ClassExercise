package com.Loc.BoxPractice;

public class Circle extends Shape implements TwoDimentional{
    final private double pi = 3.14;
    double radius;

    public Circle (double radius){
        setRadius(radius);
    }

    public Circle (double radius, String color, String name){
        setRadius(radius);
        setColor(color);
        setName(name);
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                "color = " + getColor() +
                "name = " + getName() +
                '}';
    }
}
