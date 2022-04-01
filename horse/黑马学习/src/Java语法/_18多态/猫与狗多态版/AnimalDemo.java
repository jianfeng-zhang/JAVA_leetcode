package Java语法._18多态.猫与狗多态版;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");//
        a.setAge(7);//成员变量属于父类成员
        System.out.println("第一只"+a.getName()+","+a.getAge());
        a.eat();//方法调用的是子类方法（猫的）
        Animal b=new Cat("zc",2);
        System.out.println("第二只"+","+b.getName()+","+b.getAge());
        b.eat();//方法调用的是子类方法（狗的）
        //还可以发现，要是用了多态，只会执行子类的方法，从来不会执行父类的方法
        // 所以我们可以把父类定义成一个 抽象类

    }
}
