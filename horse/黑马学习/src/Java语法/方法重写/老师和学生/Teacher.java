package Java语法.方法重写.老师和学生;

public class Teacher extends Person{
    public Teacher(){}
    public void teach  (){ System.out.println("好好教书");
    }
    public  Teacher(String name,int age){
        super(name,age);

    }
}