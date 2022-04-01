package Java语法;

import java.util.HashMap;
import java.util.Map;

public class qq {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(3,"3fd");

        map.put(3,"rrr");
        map.put(6,"erhrs");
        for(Map.Entry<Integer,String> i: map.entrySet()){
            System.out.println(i.getKey()+" and "+i.getValue());
        }
    }
}
