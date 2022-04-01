package 算法_二.进阶数据结构.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {

    }
    public int []  pmaxSlidingWindow(int [] nums,int k){

        int [] results=new int [nums.length-k+1];
        PriorityQueue<Integer> PQ=new PriorityQueue<>(k,
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                }
        );

        for(int i=0;i<nums.length;i++){
            if(i>=k){
                PQ.remove(nums[i-k]);//比如k=3 当i=3时，i-k=0所以移除第0位
            }
            PQ.offer(nums[i]);
            if(i>=k-1){
                results[i-k+1]=PQ.peek();
            }
        }//因为是循环是n个点所以有个n,因为这里的remove是在长度为k的优先队列里remove所以总时间复杂度是nk
        return results;
    }
}
