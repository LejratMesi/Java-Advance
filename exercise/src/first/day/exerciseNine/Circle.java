package first.day.exerciseNine;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Circle {
    private Point2D center;
    private Point2D point;


    public Circle(Point2D center, Point2D point){
        this.center = center;
        this.point = point;
    }

    public Double getRadius(){
        Double radius =Math.sqrt((Math.pow(point.getX(),2))+(Math.pow(point.getY(),2)));
        return radius;
    }

    public Double getPerimeter(){
        Double perimeter = 2*Math.PI*getRadius();
        return perimeter;
    }

    public Double getArea(){
        Double area = Math.PI*getRadius()*getRadius();
        return area;
    }

    public List<Point2D> getSlicePoints(){
        List<Point2D> points = new ArrayList<>();
        for(int i =1; i<= 3; i++){
            Point2D newPoint = getNewPointCoordinate(point);
            points.add(newPoint);
            point.setX(newPoint.getX());
            point.setY(newPoint.getY());
        }
        return points;
    }

    public Point2D getNewPointCoordinate(Point2D point){
        Double newPointX = null;
        Double newPointY = null;
        if (point.getX() >= 0 && point.getY() > 0)
        {
            newPointX = point.getX();
            newPointY = -(point.getY());
        }
        else if (point.getX()>0 && point.getY() <= 0){
            newPointX = -(point.getX());
            newPointY = point.getY();
        }
        else if (point.getX() <= 0 && point.getY() < 0){
            newPointX = point.getX();
            newPointY = -(point.getY());
        }
        else if (point.getX() < 0 && point.getY() >= 0){
            newPointX = -(point.getX());
            newPointY = point.getY();
        }

        return new Point2D(newPointX,newPointY);
    }
}
