package Java语法._25Set集合.哈希表遍历学生_学生不重复;

import Java语法.方法重写.NewPhone;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> t=new TreeSet<>();

        Student S1= new Student("x",23);
        Student S2= new Student("c",24);
        t.add(S1);
        t.add(S2);
        
    }
}
