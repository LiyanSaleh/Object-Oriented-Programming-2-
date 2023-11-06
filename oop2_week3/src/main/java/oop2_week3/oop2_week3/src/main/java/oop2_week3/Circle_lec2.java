package oop2_week3;

public class Circle_lec2 {
    public static final double PI=3.14;
    private int rad;
    public Circle_lec2(int rad){
        setRad(rad);
    }
    public Circle_lec2(){
        
    }
    public double getArea(){
        double area=PI*rad*rad;
        return area;
    }
    public double getRound(){
        double round=2*PI*rad;
        return round;
    }
    public int getRad(){
        return rad;
    }
    public void setRad(int rad){
        if(rad>0){
            this.rad=rad;
        }
    }
}

