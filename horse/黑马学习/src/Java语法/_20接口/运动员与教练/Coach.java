package Java语法._20接口.运动员与教练;

public abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }


    public abstract void teach();
}
