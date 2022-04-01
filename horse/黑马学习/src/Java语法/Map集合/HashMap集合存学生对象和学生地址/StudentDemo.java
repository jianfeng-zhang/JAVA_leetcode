package Java语法.Map集合.HashMap集合存学生对象和学生地址;

import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {


        HashMap<Student, String> hm = new HashMap<Student, String>();

        Student s1 = new Student("z", 23);
        Student s2 = new Student("x", 22);
        Student s3 = new Student("c", 27);
        Student s4 = new Student("c", 27);
        hm.put(s1, "tian");
        hm.put(s2, "dian");
        hm.put(s3, "vian");
        hm.put(s3, "yian");
        Set<Student> s=hm.keySet();
        for(Student a:s){
            System.out.println(a+hm.get(a));//hm.get(key)是有键取值的方法
        }
    }
}
