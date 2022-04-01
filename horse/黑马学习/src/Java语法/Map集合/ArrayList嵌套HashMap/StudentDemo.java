package Java语法.Map集合.ArrayList嵌套HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> al =new ArrayList<>();
        HashMap<String,String> hm1=new HashMap<>();
        HashMap<String,String> hm2=new HashMap<>();
        HashMap<String,String> hm3=new HashMap<>();
        al.add(hm1);
        al.add(hm2);
        al.add(hm3);
        hm1.put("z","z");
        hm1.put("x","x");
        hm2.put("c","c");
        hm2.put("b","b");
        hm3.put("n","n");
        hm3.put("m","m");
        for(HashMap<String,String> i:al){
            Set<String> keySet=i.keySet();
            for(String s: keySet){
                System.out.println(s+i.get(s));
            }


        }
    }
}
