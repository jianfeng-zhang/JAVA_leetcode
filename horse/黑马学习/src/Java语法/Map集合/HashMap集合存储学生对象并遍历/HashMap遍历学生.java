package Java语法.Map集合.HashMap集合存储学生对象并遍历;

import java.util.HashMap;
import java.util.Set;

public class HashMap遍历学生 {
    public static void main(String[] args) {
        HashMap<String, Student> hm=new HashMap<String, Student>();
        Student s1=new Student("zzz",45);
        Student s2=new Student("xxx",41);
        Student s3=new Student("ccc",47);
        hm.put("001",s1);
        hm.put("002",s2);
        hm.put("003",s3);
        Set<String> set = hm.keySet();
        for(String s: set){
            System.out.println(s+hm.get(s));
        }
    }
}
