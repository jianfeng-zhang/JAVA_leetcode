package Java语法.方法重写.老师和学生;

public class PersonDemo {
    public static void main(String[] args) {
    Teacher t=new Teacher();
    t.setName("zc");
    t.setAge(20);
        System.out.println(t.getName()+","+t.getAge());
        t.teach();
        Teacher t2=new Teacher("df",64);
        System.out.println(t2.getName()+","+t2.getAge());
    Student s=new Student();
        s.setName("zzz");
        s.setAge(12);
        System.out.println(s.getName()+","+s.getAge());
        s.study();
    Student s2=new Student("zzzz",42);
        System.out.println(s2.getName()+","+s2.getAge());
    }
}
