package Java语法._23collection接口.Collection集合遍历学生类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<Student> c=new ArrayList<Student>();//Collection需要用多态的形式实现
        Student s=new Student("z",35);
        Student s1=new Student("c",24);
        Student s2=new Student("s",36);
        c.add(s);
        c.add(s1);
        c.add(s2);
        Iterator <Student> it=c.iterator();//调用iterator 前面I是大写，后面是小写
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
}
