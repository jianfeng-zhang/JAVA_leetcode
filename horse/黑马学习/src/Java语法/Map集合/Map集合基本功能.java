package Java语法.Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map集合基本功能 {
    public static void main(String[] args) {
        Map<String,String> s =new HashMap<>();
        s.put("fsz","fffds");
        s.put("qwfs","dva");
        s.put("vaq","vwqc");
        s.remove("");//只能是键，不能是值
        System.out.println(s);

        Set<String> set=s.keySet();

        for(String i:set){
            System.out.println(i);
        }
        Collection<String> a =s.values();
        for(String i:a){
            System.out.println(i);
        }
    }
}
