package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    //const.
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //getHeight method
    public double getHeight() {
        return height;
    }

    //getVolume method
    public double getVolume() {
        return getArea() * height;
    }
}
