package com.workintech.pool;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 1);

        Cuboid cuboid = new Cuboid(2, 1, 3);

        System.out.println("Rectangle Area: " + String.format("%.2f", rectangle.getArea())); // 2.00
        System.out.println("Cuboid Volume: " + String.format("%.2f", cuboid.getVolume())); // 6.00
    }
}