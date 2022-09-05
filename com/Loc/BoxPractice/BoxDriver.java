package com.Loc.BoxPractice;


public class BoxDriver {
    public static void main(String[] args) {
        Box box1 = new Box(5,6,7);
        Box box2 = new Box(10);
        System.out.println("Box1 length is " + box1.getLength());
        System.out.println("Box1 width is " + box1.getWidth());
        System.out.println("Box1 height is " + box1.getHeight());
        System.out.println("Box2 length is " + box2.getLength());
        System.out.println("Box2 width is " + box2.getLength());
        System.out.println("Box2 height is " + box2.getLength());

        box1.setLength(3);
        box1.setWidth(4);
        box1.setHeight(5);
        System.out.println("New length box1 Value is " + box1.getLength());
        System.out.println("New width box1 Value is " + box1.getWidth());
        System.out.println("New height box1 Value is " + box1.getHeight());

        System.out.println("The Volume is " + box1.getVolume()); //get volume

        box1.printBox();

        box1.setWidth(-5); //change length to -5
        box1.setHeight(0);
        box1.printBox();

        //Challenge: Change the Box constructors so that new boxes can only be created with
        //valid attributes. If a constructor detects an invalid parameter, use a default
        //value of 1 (one). First set private attribute to 1 then set if condition in the constructor.

        Box box3 = new Box(10,-2,0);
        box3.printBox();
        ;



    }
}
