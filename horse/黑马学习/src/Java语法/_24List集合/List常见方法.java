package Java语法._24List集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
;
//注意add方法是重写了toString的，所以可以直接sout(对象名)
public class List常见方法 {
    public static void main(String[] args) {
        List<String> i=new ArrayList();
        i.add("wfw");
        i.add("fds");
        i.add("grgg");
        i.add(1,"q");//在1索引处插入“q”
        System.out.println(i);
        i.remove(1);
        System.out.println(i);

    }


}
