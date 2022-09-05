package com.Loc.BoxPractice;

public class CubeDriver {
    public static void main(String[] args) {
        Cube cube1 = new Cube(10);
        System.out.println(cube1.getLength());
        System.out.println(cube1.getHeight());
        System.out.println(cube1.getWidth());
        Cube cube2 = new Cube(14);
        cube2.printBox();
    }
}
