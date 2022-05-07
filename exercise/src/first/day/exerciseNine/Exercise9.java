package first.day.exerciseNine;

import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(0d,0d), new Point2D(2d,2d));
        System.out.println(circle.getRadius());
        circle.getArea();
        circle.getPerimeter();
        List<Point2D> point2DList = circle.getSlicePoints();
        for (Point2D point : point2DList){
            System.out.println("x : " + point.getX() + " y : " + point.getY());
        }
    }
}
