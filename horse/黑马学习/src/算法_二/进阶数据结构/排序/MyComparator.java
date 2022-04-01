package 算法_二.进阶数据结构.排序;

import java.util.Comparator;


    public class MyComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b){
            return a.start-b.start;
        }

}
