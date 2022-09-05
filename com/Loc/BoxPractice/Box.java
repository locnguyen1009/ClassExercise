package com.Loc.BoxPractice;

public class Box extends Shape implements ThreeDimensional{
    private double height = 1;
    private double width = 1;
    private double length = 1;

    public Box(double height, double width, double length) {
        if (height > 0)
        this.height = height; //without {} is still ok
        if (width > 0)
        this.width = width; //without {} is still ok
        if (length > 0)
        this.length = length; //without {} is still ok
    }
//this code is optional or can be used for same value for all three sides
    Box (double side){
        this(side, side, side);
    }

    public Box (double length, double width, double height, String color, String name){
        this(length, width, height);
        setColor(color);
        setName(name);
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0){
            this.height = height;
        }else {
            System.out.println("Height must be greater than 0");
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0){
            this.width = width;
        }else {
            System.out.println("Width must be greater than 0");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length>0){
            this.length = length;
        }else {
            System.out.println("length must be greater than 0");
        }
    }

    public double getVolume() {
        //cube = height*width*height;
        //return cube;
        return (height*width*length);

    }
    public double getSurfaceArea(){
        return ((2*length+2*width)*height);
        // double surfaceArea = (2*length+2*width)*height;
        // return surfaceArea;
    }

    public void printBox (){
        if (height<=0){ //using or not and
            System.out.println("Invalid number. Height must be greater than 0");
        }else if (width <=0) {
            System.out.println("Invalid number. Width must be greater than 0");
        }else if (length <=0) {
            System.out.println("Invalid number. Length must be greater than 0");
        }else {
            System.out.println("length = " + length);
            System.out.println("width = " + width);
            System.out.println("height = " + height);
            System.out.println("volume = " + getVolume());
            System.out.println("Surface Area = " + getSurfaceArea());
        }
    }

    @Override
    public String toString() { //use to print out in the main
        return "Box {" +
                "height = " + height +
                ", width = " + width +
                ", length = " + length +
                ", color = " + getColor() +
                ", name = " + getName() +
                '}';
    }
}
