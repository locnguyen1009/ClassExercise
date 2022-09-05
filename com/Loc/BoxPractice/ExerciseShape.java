package com.Loc.BoxPractice;

import java.util.Random;

public class ExerciseShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[8];
        shapes[0] = new Rectangle (10.0, 20.0);
        shapes[1] = new Rectangle (5, 10);

        shapes[2] = new Square (4);
        shapes[3] = new Square (3);

        shapes[4] = new Cube (3.0);
        shapes[5] =new Cube (2.5);

        shapes[6] = new Box(12.0);
        shapes[7] = new Box(3.0);
/*

        for (Shape shape : shapes){
            shape.setColor("silver");
        }

        for (Shape shape : shapes){
            ThreeDimensional temp = (ThreeDimensional) shape;
            System.out.println(temp.getVolume());
        }
*/

        TwoDimentional[] twoDs = new TwoDimentional[3];

        twoDs[0] = new Circle(7.0);
        twoDs[1] = (TwoDimentional) new Rectangle(5.0, 4.0);
        twoDs[2] = (TwoDimentional) new Square (5.67);

        for (TwoDimentional temp : twoDs){
            System.out.println(temp.getArea());
            System.out.println(temp.getPerimeter());
        }



    }

}
