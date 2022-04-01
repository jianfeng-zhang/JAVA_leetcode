package Java语法._18多态;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animals s=new Cat();
        s.eat();//调用的是子类重写以后的方法，所以就是用父类对象调用子类成员
        //但s调用成员变量时，调用的仍是父类的值
    }
}
