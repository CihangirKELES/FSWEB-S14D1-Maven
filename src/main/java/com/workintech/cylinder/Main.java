package com.workintech.cylinder;

public class Main {
    public static void main(String[] args) {
        //circle
        Circle circle = new Circle(5);

        //cylinder
        Cylinder cylinder = new Cylinder(5, 10);

        //info circle
        System.out.println("Circle Area: " + circle.getArea());

        //info cylinder
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}
