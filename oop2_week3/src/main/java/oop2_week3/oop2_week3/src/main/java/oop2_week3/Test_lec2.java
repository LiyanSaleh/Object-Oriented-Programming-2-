package oop2_week3;

import static oop2_week3.Util.*;

public class Test_lec2 {
    public static void main (String args[]){
        Circle_lec2 c1= new Circle_lec2(10);
        print(c1.getRound());
        Circle_lec2 c2= new Circle_lec2();
        c2.setRad(15);
        print(c2.getArea());
    } 
}
