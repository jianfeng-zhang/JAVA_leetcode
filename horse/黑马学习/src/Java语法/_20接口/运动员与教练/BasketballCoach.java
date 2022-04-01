package Java语法._20接口.运动员与教练;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void eat() {
        System.out.println("篮球教练喝啤酒");
    }

    @Override
    public void teach() {
        System.out.println("教投篮和运球");

    }
}
