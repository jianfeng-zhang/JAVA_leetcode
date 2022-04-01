package Java语法._14存储学生对象并遍历;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentDemo {
    public static void main(String[] args) {
       ArrayList<Student> st=new ArrayList<>();
        arrayToStudent(st);
        for(int i=0;i<st.size();i++){
            Student s=st.get(i);
            System.out.println(s.getName()+","+s.getAge());

        }
    }
    public static void arrayToStudent(ArrayList<Student> st){
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String s1 = sc.nextLine();
        s.setName(s1);
        System.out.println("请输入学生年龄");
        String s2 = sc.nextLine();
        s.setAge(s2);
        st.add(s);





    }
}