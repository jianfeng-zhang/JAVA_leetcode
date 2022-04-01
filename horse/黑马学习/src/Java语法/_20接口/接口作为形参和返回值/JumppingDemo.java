package Java语法._20接口.接口作为形参和返回值;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator JO=new JumppingOperator();
        Jumpping j=new Animal();
        JO.useJump(j);

        Jumpping a=JO.reJump();
        a.jump();



    }
}
