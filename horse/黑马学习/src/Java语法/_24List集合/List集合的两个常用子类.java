package Java语法._24List集合;

import java.util.ArrayList;
import java.util.LinkedList;
//List集合的两个常用子类为ArrayList和LinkedList
public class List集合的两个常用子类 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("z");
        al.add("x");
        al.add("c");
        for(String s:al){
            System.out.println(s);
        }
        LinkedList<String> s=new LinkedList<>();
        s.add("v");
        s.add("b");
        s.add("n");
        for(String q:s){
            System.out.println(q);
        }

    }
}
