package Java语法.集合ArrayList;

import java.util.ArrayList;

public class 集合 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("hello");
        a.add("world");
        a.add(1,"Java");
        System.out.println(a);
        a.remove(1);

        System.out.println(a);
        a.set(1,"Chinese");
        System.out.println(a);

        System.out.println(a.get(1));

        System.out.println(a.size());
    }
}
