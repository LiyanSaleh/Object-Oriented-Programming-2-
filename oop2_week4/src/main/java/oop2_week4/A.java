package oop2_week4;
public class A implements Speaker{
    public void m1(){
        System.out.println("hello from A");
    }
    @Override
    public void hello(){
        System.out.println("hello from A again!");
    }
}
