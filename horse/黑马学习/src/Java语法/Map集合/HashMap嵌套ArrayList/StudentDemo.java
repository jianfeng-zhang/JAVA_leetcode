package Java语法.Map集合.HashMap嵌套ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
        ArrayList<String> a1=new ArrayList<>();
        a1.add("诸葛亮");
        a1.add("赵云");
        ArrayList<String> a2=new ArrayList<>();
        a2.add("刘备");
        a2.add("张飞");
        ArrayList<String> a3=new ArrayList<>();
        a3.add("曹操");
        a3.add("荀彧");
        hm.put("朱赵",a1);
        hm.put("刘章",a2);
        hm.put("曹",a3);

        Set<String> set = hm.keySet();
        for(String s:set){
            System.out.println(s);
            ArrayList<String> g=hm.get(s);
            for(String i:g ){
                System.out.println(i);
            }

            }
        }


    }

