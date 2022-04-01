package Java语法._18多态.猫与狗多态版;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
