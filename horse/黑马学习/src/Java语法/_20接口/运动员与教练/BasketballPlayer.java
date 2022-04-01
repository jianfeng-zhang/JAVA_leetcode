package Java语法._20接口.运动员与教练;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void eat() {
        System.out.println("篮球学学员吃饭");
    }

    @Override
    public void study() {
        System.out.println("吃篮球饭");
    }
}
