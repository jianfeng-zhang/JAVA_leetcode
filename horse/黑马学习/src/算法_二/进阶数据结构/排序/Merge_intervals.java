package 算法_二.进阶数据结构.排序;

import 算法_二.进阶数据结构.Heap.ListNode;

import java.util.*;


public class Merge_intervals {
    public static void main(String[] args) {

    }
    public List<Interval> merge (List<Interval> intervals){
        List<Interval> ans=new ArrayList<Interval>();
        if(intervals.size()==0)return ans;
        Collections.sort(intervals,new MyComparator());
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=0;i<intervals.size();i++){
            Interval inter=intervals.get(i);
            if(inter.start>end){
                ans.add(new Interval(start,end));
                start=inter.start;
                end=inter.end;
            }else{
                end=Math.max(end,inter.end);
            }
        }
        ans.add(new Interval(start,end));

        return ans;
    }

}
