package Java语法._20内部类;

public class Demo {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.method();//这个方法创建了一个内部类并且调用了show方法

    }
}
