package Java语法._20内部类.局部内部类;

public class Outer {
    private int num=10;
    public void method(){

        class Inner{
            public void show(){
                System.out.println("局部内部类");
            }
        }
        Inner i=new Inner();
        i.show();

    }
}
