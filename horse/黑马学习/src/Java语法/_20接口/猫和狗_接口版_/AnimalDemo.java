package Java语法._20接口.猫和狗_接口版_;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setName("加肥");
        c.setAge(4);
        System.out.println(c.getName()+","+c.getAge());
        c.jump();
        c.eat();//因为猫类继承动物类，也实现跳接口，所以猫的对象可调用的方法最多，所以实际操作我们都是创建子类
        //并不会创建父类对象

    }
}
