package Java语法._25Set集合;

import java.util.HashSet;
import java.util.Set;

public class Set集合的使用 {
    public static void main(String[] args) {
        Set<String> S=new HashSet<>();
        S.add("z");
        S.add("x");
        S.add("c");
        for(String s:S){
            System.out.println(s);

        }

    }
}
