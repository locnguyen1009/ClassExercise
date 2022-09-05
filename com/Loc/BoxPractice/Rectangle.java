package com.Loc.BoxPractice;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle (double length, double width){
        this(length, width, "Unknown", "white");
    }

    public Rectangle (double length, double width, String color, String name){
        super();
        this.setLength(length);
        this.setWidth(width);
        setName(name);
        setColor(color);

    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double GetPerimeter(){
        return 2*(length*width);
    }

    @Override
    public String toString() { //use to print out in the main
        return "Rectangle {" +
                "length = " + length +
                ", width = " + width +
                ", name = " + getName() +
                ", color = " + getColor() +
                '}';
    }
}
