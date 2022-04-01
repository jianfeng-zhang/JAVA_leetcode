package 算法_二.进阶数据结构.Heap;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum1 {
    public static void main(String[] args) {
        //用双向栈的方法，用滑动窗口，输出窗口里最大的元素




    }
    public int[] maxSlidingWindow(int [] nums,int k){
        int [] results=new int[nums.length-k+1];
        Deque<Integer> DQ=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(!DQ.isEmpty() && DQ.peekFirst()<=i-k){
                DQ.pollFirst();
            }
            while (!DQ.isEmpty()&&nums[DQ.peekLast()]<nums[i]){
                DQ.pollLast();//当队列里的值小于即将进队的值时，就把这个值用在右remove的操作给弹出去
            }
        DQ.offerLast(nums[i]);
            if(i-k+1>=0){//这个窗口长度是k，他的前和后分别是i-k+1 和i
                results[i-k+1]=DQ.pollFirst();
            }
        }
        return results;
        //操作先看看有没有元素已经出window了如果已经出了，就直接从左边剔除，在看看即将进来的元素是不是比他左边的大。
        // 如果大，就直接把他左边的元素从右边清出去，然后添加元素，这时能保证新家的元素要不小于他左边的元素要不就整个栈只有他一个元素
        // 最后给result赋值
    }
        //这题主要注意，因为窗口随时都在动，所以deque的左边元素随时在往外扔，并不是一直不变
        //之所以用单调栈的思想是，可以考虑把那些没用的元素（右边比他大）都删掉
}


