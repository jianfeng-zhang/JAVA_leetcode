package 算法_二.进阶数据结构.Stack;

import java.util.Stack;

public class Largest_rectangle_in_Histogram {
    public static void main(String[] args) {
    }
    public  static int largestRectangle(int [] height){
        int area=0;
        int width;
        Stack<Integer> S=new Stack<>();
        for(int i = 0 ;i<height.length;i++){
            if(S.isEmpty()||height[S.peek()]<height[i]){S.push(i);}
            //S.peek()是一个索引不是真正的高度
            else{
                while(!S.isEmpty() && height[S.peek()]>=height[i]){
                    int eleIndex=S.pop();
                    width=S.empty()?i:i-S.peek()-1;//如果这个值前面没有元素了，都被pop了说明这个值比前面任何一个值都小，所以直接宽度就是index
                    area=Math.max(area, width*height[eleIndex]);
                }
                S.push(i);
            }
        }
        while(!S.isEmpty()){
            int elementIndex=S.pop();
            width=S.isEmpty()? height.length:height.length-S.peek()-1;
            area=Math.max(area, width*height[elementIndex]);
        }
        return area;

    }
}
