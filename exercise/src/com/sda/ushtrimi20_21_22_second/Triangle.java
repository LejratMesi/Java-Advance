package com.sda.ushtrimi20_21_22_second;

public class Triangle extends Shape {

    private Double brinjaA;
    private Double brinjaB;
    private Double brinjaC;

    public Triangle(Double brinjaA, Double brinjaB, Double brinjaC) {
        this.brinjaA = brinjaA;
        this.brinjaB = brinjaB;
        this.brinjaC = brinjaC;
    }

    @Override
    public Double calculatePerimeter() {
        return brinjaA+brinjaB+brinjaC;
    }

    @Override
    public Double calculateArea() {
        Double lartesia = (brinjaA + brinjaB + brinjaC) / 2;
        Double siperfaqja = Math.sqrt(lartesia * (lartesia - brinjaA) * (lartesia - brinjaA) * (lartesia - brinjaA));
        return siperfaqja;
    }
}
