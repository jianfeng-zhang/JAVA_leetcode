package Java语法._20接口.抽象类作为形参和返回值;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator a=new AnimalOperator();
        Animal b=new Cat();
        a.useAnimal(b);
        Animal c=a.reAnimal();
        a.useAnimal(c);
    }
}
