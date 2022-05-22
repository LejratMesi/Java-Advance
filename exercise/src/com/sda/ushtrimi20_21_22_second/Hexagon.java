package com.sda.ushtrimi20_21_22_second;

public class Hexagon extends Shape{
    private Double brinja;

    public Hexagon(Double brinja) {
        this.brinja = brinja;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimetriHex=6*brinja;
        return perimetriHex;
    }

    @Override
    public Double calculateArea() {
        Double areaOfHexagon = ((3 * Math.sqrt(3)) / 2) * Math.pow(brinja,2);
        return areaOfHexagon;
    }
}
