package Java语法._15学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class 主类 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        //while 里是一个boolean常量 ture和false
        while(true){
            System.out.println("---欢迎来到学生管理系统---");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            Scanner sc=new Scanner(System.in);
            String i = sc.nextLine();
            //switch 的s是小写的
            //switch 小括号（）里放的是输入数据的名称不是类型
            //每个case后面加的是冒号： 不是分号；
            //每个case执行之后要加  break
            switch(i){
                case "1":
                    System.out.println("1.添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2.删除学生");
                    removeStudent(array);
                    break;
                case "3":
                    System.out.println("3.修改学生");
                    setStudent(array);
                    break;
                case "4":
                    System.out.println("4.查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("5.退出");
                    System.exit(0);//退出虚拟机;
            }



        }
    }
    public static void addStudent(ArrayList<Student> array ){
        Student s=new Student( );
        Scanner sc=new Scanner(System.in);

        //下面这个循环是因为我想让如果输入有误，再继续输入
        while(true){
            System.out.println("请输入学生学号");
            String s1 = sc.nextLine();
        if(isUsed(array,s1)==true){
            System.out.println("已有输入学号请重新输入");

        }else{
            System.out.println("可以使用该学号");
            s.setSit(s1);
            break;

        }
        }
        //
        System.out.println("请输入学生姓名");
        String s2 = sc.nextLine();
        s.setName(s2);
        System.out.println("请输入学生年龄");
        String s3 = sc.nextLine();
        s.setAge(s2);
        System.out.println("请输入学生地址");
        String s4 = sc.nextLine();
        s.setAddress(s2);
        array.add(s);
        System.out.println("添加成功");
    }
    public static void findAllStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("没录入信息，请先录入");
            //return 用于跳出当前方法，不再往后执行方法
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for(int i=0;i<array.size();i++){
            Student s=new Student();
            s= array.get(i);
            System.out.println(s.getSit()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress() );
        }
    }
    public static void removeStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除学生的学号");
        String s = sc.nextLine();
        for(int i=0;i<array.size();i++){
            //因为sit学号我设置的是字符串，所以要用.equals()去判断，而不是用==
            //== 不能用于字符串的判断，它可用于数字
            if(array.get(i).getSit().equals(s)){
                array.remove(i);
                System.out.println("删除成功");
            return;
            }

        }
        System.out.println("没有查到该学号的学生");


    }
    public static void setStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要替换学生的学号");
        String s = sc.nextLine();
        Student st=new Student();
        s=st.getSit();
        System.out.println("请录入学生姓名");
        String name=sc.nextLine();
        System.out.println("请录入学生年龄");
        String age=sc.nextLine();
        System.out.println("请录入学生地址");
        String address=sc.nextLine();
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);
        for(int i=0;i<array.size();i++){
            if(array.get(i).getSit().equals(s)){
               //注意set方法必须加索引
                array.set(i,st);
                break;
            }
        }
        System.out.println("修改成功!");
    }

    public static boolean isUsed(ArrayList<Student> Array,String sit){

        for(int i=0;i<Array.size();i++){
            Student s=Array.get(i);
            if(s.getSit().equals(sit)){

                return true;
            }
        }
        return false;
    }//判断输入学号有没有和之前重复
}

