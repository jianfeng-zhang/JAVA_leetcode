package Java语法._24List集合.List集合遍历学生对象;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class List集合遍历学生对象 {
    public static void main(String[] args) {
        List <Student> l= new ArrayList<Student>();
        Student s1=new Student("z",12);
        Student s2=new Student("x",12);
        Student s3=new Student("c",12);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        //第一种循环方法，这种循环不能在其中改变it对象不然会报错；
        Iterator<Student> it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("------------");
        System.out.println("第二种循环遍历");
        for(int i=0;i<l.size();i++){
            Student s=l.get(i);
            System.out.println(s);
        }
        System.out.println("-----------");

    }


}
