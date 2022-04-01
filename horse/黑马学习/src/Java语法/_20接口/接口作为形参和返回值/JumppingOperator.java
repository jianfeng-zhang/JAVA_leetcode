package Java语法._20接口.接口作为形参和返回值;

public class JumppingOperator {
    public void useJump(Jumpping J){
        J.jump();//接口不能实例化所以先是Jumpping J=new Cat();
        //在调用jump函数

    }
    //两个函数

    public Jumpping reJump(){
        Jumpping a=new Animal();
        return a;

    }

}
