package com.Loc.BoxPractice;

public class Cube extends Box{
    public Cube(double side) {
        super(side);
    }

    public Cube (double side, String color, String name){
        super(side);
        setColor(color);
        setName(name);
    }

    @Override
    public void setHeight(double height){
        if (height != super.getHeight()){
            setSides(height);
        }
    }

    @Override
    public void setWidth(double width) {
        if (width != super.getWidth()){
            setSides(width);
        }
    }

    @Override
    public void setLength(double length) {
        if (length != super.getLength()){
            setSides(length);
        }
    }


    public void setSides(double sides){
       if (sides > 0) {
           super.setHeight(sides);
           super.setWidth(sides);
           super.setLength(sides);
       } else {
           System.err.println("Value must be greater than 0");
       }
    }

    public double getSides(){
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Cube {" +
                "side = " + getSides() +
                ", name = " + getName() +
                ", color =" + getColor() +
                "}";
    }
}


