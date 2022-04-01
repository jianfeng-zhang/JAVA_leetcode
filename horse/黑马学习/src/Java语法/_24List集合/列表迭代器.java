package Java语法._24List集合;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class 列表迭代器 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("z");
        list.add("x");
        list.add("c");
        ListIterator<String> Lt=list.listIterator();
        while(Lt.hasNext()){
            if(Lt.next().equals("x")){
                Lt.add("v");//注意这里是Lt对象调用add方法
            }
        }
        System.out.println(list);
    }
}
