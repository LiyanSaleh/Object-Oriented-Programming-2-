package oop2_week10;

import java.util.ArrayList;

public class A {
    ArrayList<AListener> listeners=new ArrayList();
    
    public void m1(){
        fireListener();
        System.out.println("m1 operation");
    }
    
    public void addListener(AListener listener){
        listeners.add(listener);
    }
    public void fireListener(){
    for(AListener listener: listeners){
        listener.m1IsCalled();
    }
}
}