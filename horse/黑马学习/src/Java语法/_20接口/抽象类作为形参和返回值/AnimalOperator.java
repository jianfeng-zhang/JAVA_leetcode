package Java语法._20接口.抽象类作为形参和返回值;

public class AnimalOperator {
    public void useAnimal(Animal a){
        a.eat();
    }
    public Animal  reAnimal(){
        Animal a=new Cat();//返回Animal不行因为是抽象类，所以返回的是子类cat的对象所以要先创建一个cat对象
        return a;
    }
}
