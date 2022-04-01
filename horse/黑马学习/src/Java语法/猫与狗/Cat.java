package Java语法.猫与狗;

public class Cat extends Animal {
    public Cat() {
    }

   public Cat(String name, int age) {
        super(name, age);//这个是调用的父类Animal的带参构造函数，所以父类的无参带参构造函数我们都要写出来
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
