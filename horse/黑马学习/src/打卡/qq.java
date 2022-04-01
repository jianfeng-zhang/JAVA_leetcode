package 打卡;

import java.util.Stack;

public class qq { public static void main(String[] args) {
int []nums={-2,1,-3,4,-1,2,1,-5,4};
int []dp=new int [nums.length];
    int max=nums[0];
    dp[0]=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);

    }
    for(int i=1;i<nums.length;i++){
        if(dp[i]>dp[i-1]){max=dp[i];}
        System.out.println(max);
    }
    System.out.println(max);
}
}

