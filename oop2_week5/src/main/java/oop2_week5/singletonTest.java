package oop2_week5;
public class singletonTest {
    private static singletonTest instance;
    
    private singletonTest(){
        System.out.println("new object has been created");
    }
    public static singletonTest getInstance(){
        if(instance==null){
            instance = new singletonTest();
        }
        return instance;
        }
    public void hello(){
        System.out.println("hello from singleton");
    }
}
