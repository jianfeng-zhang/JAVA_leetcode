package Java语法._24List集合;
import java.util.List;
import java.util.ArrayList;

public class 增强for循环 {
    public static void main(String[] args) {
        String[] arr={"cs0","sscs","sfsv"};
        for(String s:arr){
            System.out.println(s);
        }
        System.out.println("Collection版本");
        List<String> it=new ArrayList<>();//这里的it和arr是一个意思都是集合名称
        it.add("z");
        it.add("x");
        it.add("c");
        for(String s:it){
            System.out.println(s);
            //增强for循环调用的是iterator所以依然不能再循环期间更改元素
        }
    }
}
