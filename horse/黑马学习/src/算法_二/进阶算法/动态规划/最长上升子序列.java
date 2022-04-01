package 算法_二.进阶算法.动态规划;

import java.util.Arrays;
import java.util.Map;

public class 最长上升子序列 {
    public static void main(String[] args) {

    }
    public int help(int [] nums){
        if(nums.length==1)return 1;
        int max=0;
        int []dp =new int [nums.length];

        Arrays.fill(dp,1);//这里把所有值必须都设成1，不能不管，因为子串最小长度是1 不能是默认0
        for(int i=1;i<nums.length;i++){
            int localmax=0;
            for(int j=0;j<i;j++){
                if (nums[i]>nums[j]) {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                localmax=Math.max(localmax,dp[i]);
            }
            max=Math.max(localmax,max);
        }
        return max;
    }
}
