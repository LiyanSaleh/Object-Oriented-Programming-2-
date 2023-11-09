package oop2_week4_lec2;
public class Test {
    public static void main(String args[]){
        Student std1=new Student();
        std1.setId(10);
        std1.setName("Ata");
        std1.setGpa(3.2);
        
        Student std2=new Student(20,"kamal",2.5);
        
        Student std3=new Student();
        std3.withId(202110938).withName("Layan").withGpa(4.5).withEmail("layan@gmail.com");
    }
}
