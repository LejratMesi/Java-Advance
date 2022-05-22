package com.sda.ushtrimi20_21_22_second;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3D,5D);
        System.out.println("Rectangle's perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle's area: " +rectangle1.calculateArea() );
        System.out.println("-------------------------------------------");

        Triangle triangle1 = new Triangle(4D,3D,2D);
        System.out.println("Triangle perimeter: " + triangle1.calculatePerimeter());
        System.out.println("Triangle area: " + triangle1.calculateArea());
        System.out.println("-------------------------------------------");

        Hexagon hexagon1 = new Hexagon(3D);
        System.out.println("Hexagon perimeter: " + hexagon1.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon1.calculateArea());
        System.out.println("-------------------------------------------");

        Cone kon1=new Cone(5D,4D,3D);
        System.out.println("Perimetri i konit: "+ kon1.calculatePerimeter());
        System.out.println("Area e konit: "+ kon1.calculateArea());
        System.out.println("Volumi i konit: "+ kon1.calculateVolume());
        kon1.fill(100D);
        System.out.println("-------------------------------------------");


        Qube kub1= new Qube(4D);
        System.out.println("Perimetri i kubit: " + kub1.calculatePerimeter());
        System.out.println("Area e kubit: " + kub1.calculateArea());
        System.out.println("Volumi i kubit: " + kub1.calculateVolume());
        kub1.fill(12D);

    }
}
