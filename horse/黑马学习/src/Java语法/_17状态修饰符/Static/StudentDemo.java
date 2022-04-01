package Java语法._17状态修饰符.Static;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=12;
        s1.name="这次";
        s1.university="NU";
        System.out.println(s1.age+s1.name+Student.university);//用static修饰的变量可以直接用类调用   类名.成员变量
        Student s2=new Student();
        s1.age=13;
        s2.name="方法";
        System.out.println(s1.age+s1.name+s2.university);//用static修饰的变量不用多次赋值，因为这个变量被所有此类对象共享
    }


}
