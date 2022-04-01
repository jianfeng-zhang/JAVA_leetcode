package Java语法._20内部类;

public class Outer {
    int num=10;
    private static class inter{
        public void show(){
            System.out.println("调用内部类函数");
            //内部类可以直接调用外部类的成员
        }
    }
    public static void method(){
        inter i=new inter();
        i.show();//外部类必须创建对象才能调用内部类成员
    }
}
