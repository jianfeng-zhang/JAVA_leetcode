package Java语法._14存储学生对象并遍历;

public class Student {
    private String name;
    private String age;
    public Student(){}
    public Student(String name,String age){
        this.age=age;
        this.name=name;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }



}
