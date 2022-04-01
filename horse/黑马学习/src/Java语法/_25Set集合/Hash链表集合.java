package Java语法._25Set集合;

import java.util.LinkedHashSet;

public class Hash链表集合 {
    public static void main(String[] args) {
        LinkedHashSet<String> s=new LinkedHashSet<>();
        s.add("z");
        s.add("x");
        s.add("c");
        for(String a: s){//注意后一个元素放的是此集合对像的对象名
            System.out.println(s);
        }
    }
}
