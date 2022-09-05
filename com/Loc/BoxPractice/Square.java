package com.Loc.BoxPractice;

public class Square extends Rectangle{
    public Square (double side){
        super (side, side);
    }

    public Square (double side, String color, String name){
        super(side, side);
        setName(name);
        setColor(color);
    }

    @Override
    public String toString() {
        return "Square {" +
                "side = " + getLength() +
                ", color = " + getColor() +
                ", name = " + getName() +
                '}';
    }
}
