package Java语法._20内部类.匿名内部类;

public class Outer {
    public void method(){

        Inter i=new Inter() {
            public void show(){
                System.out.println("匿名内部类");
            }
        };//这个本质是一个对象，只不过对象没名字
        i.show();
    }

}
