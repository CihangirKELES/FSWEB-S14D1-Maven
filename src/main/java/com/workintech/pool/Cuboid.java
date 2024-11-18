package com.workintech.pool;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getLength() * getWidth() * height;
    }

    public String getFormattedVolume() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.FRANCE);
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
        return df.format(getVolume());
    }
}
