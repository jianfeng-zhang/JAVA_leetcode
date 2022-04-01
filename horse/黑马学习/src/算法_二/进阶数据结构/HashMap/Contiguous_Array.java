package 算法_二.进阶数据结构.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array {
    public static void main(String[] args) {
        int[] nums={0,1};
        int i=findMaxLength(nums);
        System.out.println(i);
    }
    public static int findMaxLength(int []nums){
        int max=0;
        Map<Integer, Integer> map=new HashMap<>();
        //  map.put(0,0);//一开是数组第一位没有后一位，所以默认放一个0，0,同时防止nums只有一位数
        int []differ=new int[nums.length+1];
        map.put(0,0);//当字符串为空没有0，也没有1时，可以当成0个10 ，这个是为了后面nums=｛0，1｝用
        //当[0,1]遍历到1时，这已经是第二次0数=1数了
        for(int i=1;i<nums.length+1;i++){
            differ[i]=differ[i-1]+(nums[i-1]==0? -1:1);
            if(map.containsKey(differ[i])){max=Math.max(max,i-map.get(differ[i]));}
            else{
                map.put(differ[i],i);
            }
        }
        return max;
    }
}
