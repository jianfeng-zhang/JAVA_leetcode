package Java语法._20接口.运动员与教练;

public class PPCoach extends Coach implements SpeakEnglish{
    public PPCoach(String name, int age) {
        super(name, age);
    }

    public PPCoach() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void teach() {

    }
    public void speak(){};
}
