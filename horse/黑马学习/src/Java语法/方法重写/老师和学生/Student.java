package Java语法.方法重写.老师和学生;

public class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name,age);


    }
    public void study(){
        System.out.println("好好学习");
    }
}
