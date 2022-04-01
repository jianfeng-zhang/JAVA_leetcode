package Java语法._18多态.猫与狗多态版;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
