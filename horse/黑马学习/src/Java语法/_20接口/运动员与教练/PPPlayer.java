package Java语法._20接口.运动员与教练;

public class PPPlayer extends Player implements SpeakEnglish{
    public PPPlayer() {
    }

    public PPPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃乒乓球");
    }
    public void study(){
        System.out.println("学篮球");
    }
    public void speak(){};
}
