package oop2_week5;
public class Test {
    public static void main(String args[]){
        for(int i=0;i<100;i++){
        singletonTest test=singletonTest.getInstance();
        test.hello();
    }
    }
}

// local variables: method
// Instance variables: object
// Class variable: class
