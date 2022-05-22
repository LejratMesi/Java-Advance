package com.sda.ushtrimi20_21_22_second;

public class Rectangle extends Shape {
    private Double length;
    private Double width;


    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {

        double perimeterRectangle = 2*(length + width);
        return perimeterRectangle;
    }

    @Override
    public Double calculateArea() {
      double areaRectangle = width * length;
        return areaRectangle;
    }
}
