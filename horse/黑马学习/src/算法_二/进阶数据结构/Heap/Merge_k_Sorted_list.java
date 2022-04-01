package 算法_二.进阶数据结构.Heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_k_Sorted_list {
    public static void main(String[] args) {
    }
    public ListNode mergeKList(ListNode[] lists){
        Comparator<ListNode> comparator=new Comparator<ListNode>() {

            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        };
        //o1表示现在要存入的那个元素
        //o2表示已经存入到集合的元素
        //return >0表示新进元素比之前的元素大，所以往下放
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>(lists.length,comparator);
        //这个初始化是指定容量和比较器的初始化
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null) minHeap.add(lists[i]);
        }
        ListNode dummy=new ListNode();
        ListNode cur=dummy;
        while(!minHeap.isEmpty()){
            cur.next=minHeap.poll();
            //poll和add的操作时间复杂度是logn
            //如果是K个链表，每个链表有n个元素
            //因为循环一共肯定循环kn次，每一个元素都要循环
            //所以这里整个是一个循环加一个logn 就是kn * logk 其中k表示优先队列的长度
            cur=cur.next;
            if(cur.next!=null){minHeap.add(cur.next);}
        }
        return dummy.next;
    }
}






























