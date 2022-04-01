package Java语法._20接口.猫和狗_接口版_;

public class Dog extends Animal implements Jumpping {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void jump(){
        System.out.println("狗跳高");
    }
}
