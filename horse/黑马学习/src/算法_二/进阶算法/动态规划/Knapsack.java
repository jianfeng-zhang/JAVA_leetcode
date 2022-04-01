package 算法_二.进阶算法.动态规划;

public class Knapsack {
    public static void main(String[] args) {

    }
    public int knapsack(int capacity, int [] weights, int [] values){
        int length=weights.length;
        if(capacity==0||length==0)return 0;

        int [][]dp=new int [length+1][capacity+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }//其实这两步的循环可以不做，因为JAVA数组本身默认值就是0
        for(int i=1;i<dp.length;i++){
            int index=i-1;
            for(int j=1;j<dp[0].length;j++){
                if(j<weights[index]){//判断他能不能装进去
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],values[index]+dp[i-1][j-weights[index]]);
                }
            }

        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
