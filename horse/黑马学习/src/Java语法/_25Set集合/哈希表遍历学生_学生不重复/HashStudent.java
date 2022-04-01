package Java语法._25Set集合.哈希表遍历学生_学生不重复;

import java.util.HashSet;

public class HashStudent {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        Student s1=new Student("z",13);
        Student s2=new Student("x",35);
        Student s3=new Student("v",54);
        Student s4=new Student("x",35);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        for(Student s:hs){
            System.out.println(s);
        }
    }
}
