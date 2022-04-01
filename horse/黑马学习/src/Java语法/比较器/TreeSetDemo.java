package Java语法.比较器;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //这里的o1是输入值，o2是之前就已经存在的被比较值
                //如果o1大于o2 则说明新进来的这个大应该放后面，，，
                //这样就形成了从上到下从小到大排的序列
                int num = o1.age-o2.age;
                return num;//当返回值是num==0 则判定o1,o2是相等的
              
            }
        });
    }
}
