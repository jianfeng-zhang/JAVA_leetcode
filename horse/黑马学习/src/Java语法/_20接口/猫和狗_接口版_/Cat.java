package Java语法._20接口.猫和狗_接口版_;

public class Cat extends Animal implements Jumpping{//因为父类已经定义好了成员变量
    // 所以之后子类不用定义变量了直接调用父类的成员方法super即可
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
