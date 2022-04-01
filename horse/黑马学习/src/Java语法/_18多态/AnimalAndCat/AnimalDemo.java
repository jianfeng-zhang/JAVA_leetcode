package Java语法._18多态.AnimalAndCat;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperate ao=new AnimalOperate();
        Cat c=new Cat();
        ao.eatAnimal(c);
        Dag d=new Dag();
        ao.eatAnimal(d);

        c.eat();
        d.eat();
    }
}
