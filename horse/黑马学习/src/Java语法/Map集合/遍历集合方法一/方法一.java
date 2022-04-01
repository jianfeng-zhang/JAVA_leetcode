package Java语法.Map集合.遍历集合方法一;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 方法一 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("gds","ges");
        m.put("jxe","wavg");
        m.put("njjr","qgh");
        Set<String> k =m.keySet();
        for(String i:k){


            System.out.println("键的值"+i+"对应的值"+m.get(i));
        }
    }
}
