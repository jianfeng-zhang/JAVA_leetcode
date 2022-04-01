package Java语法._25Set集合.自然排序comparabe使用;
import java.util.TreeSet;
public class 学生排序 {
    public static void main(String[] args) {
        TreeSet<Student> s=new TreeSet<>();
        Student s1=new Student("zz",31);
        Student s2=new Student("dvd",62);
        Student s3=new Student("da",62);
        s.add(s1);
        s.add(s2);
        s.add(s3);


        for(Student a:s){
            System.out.println(a);
        }



    }
}
