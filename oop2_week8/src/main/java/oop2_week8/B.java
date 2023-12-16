package oop2_week8;
public class B {
   C c = new C();
   
  public C getC(){
       return c;
   }
   public void setC(C c){
       this.c = c;
   }
    public void process(String s){
       c.m1(s);
   }
}
