package Java语法._23collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection接口遍历 {
    public static void main(String[] args) {

        Collection<String> it=new ArrayList<>();

        it.add("zc");
        it.add("wvs");
        System.out.println(it);
        Iterator<String> c= it.iterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }
    }
}
