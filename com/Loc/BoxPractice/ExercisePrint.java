package com.Loc.BoxPractice;

public class ExercisePrint {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Rectangle(5.0, 4.0, "blue", "Rectangle1");
        shapes[1] = new Square(8.0, "red", "Square1");
        shapes[2] = new Cube(5.0, "yellow", "cube1");
        shapes[3] = new Box(12.0, 15.0, 6.0, "orange", "box1");
        shapes[4] = new Circle(3.0, "Lavender", "Circle1");

        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
