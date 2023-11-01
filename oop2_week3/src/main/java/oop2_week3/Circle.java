package oop2_week3;
public class Circle {
    int radius;
    
    public double getRound(){
        double round=2*Math.PI*radius;
        return round;
    }
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
}
