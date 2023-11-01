package oop2_week3;
public class Oop2_week3 {
     public static void main(String[] args) {
        Person p1=new Person();
        p1.age=100;
        p1.name="Layan";
        p1.sayHello();
        
        Person p2=new Person();
        p2.name="Nooran";
        p2.sayHello();
        
        Person p3=p1;
        p3.sayHello();
        p3.name="Noor";
        p3.sayHello();
        
//        Person p4=null;
//        p4.name="Ali";
//        p4.sayHello();
         
    }        
}
     
