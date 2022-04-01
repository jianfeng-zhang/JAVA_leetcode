package Java语法.构造方法;

public class Student {
    private int age;
    private String name;

    // 无参构造方法
    public  Student(){
        System.out.println("调用了无参构造方法");
    }
    public  Student(String name, int age){
        this.age=age;
        this.name=name;
        System.out.println();
    }

    public void setAge(int age){
        this. age=age;
   }
   public int getAge() {
       return age;
   }
   public void setName(String name){
        this.name=name;

   }
   public String getName(){
        return name;
   }
   public void show(){
       System.out.println(name+","+age);
   }
}
