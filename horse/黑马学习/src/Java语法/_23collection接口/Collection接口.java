package Java语法._23collection接口;

import java.util.ArrayList;
import java.util.Collection;

public class Collection接口 {
    public static void main(String[] args) {
        Collection<String> i=new ArrayList();
        i.add("ddsf");
        i.add("egsda");
        System.out.println(i);
        i.remove("ddsf");
        System.out.println(i);
        System.out.println( i.contains("egsda"));
        System.out.println(i.isEmpty());
        System.out.println(i.size());

    }//i本来应该输出地址，但add改写了toString方法，所以i输出了内容
}
