package 算法_二.进阶算法.动态规划;

public class unique_paths_weight {
    public static void main(String[] args) {
    }
    public int minPathSum(int [][]grad) {
        int m=grad.length;
        int n=grad[0].length;
        int [][]dp=new int [m][n];
        if(grad==null||grad.length==0)return 0 ;
        dp[0][0]=grad[0][0];
        for(int i=1;i<grad.length;i++){
            dp[0][i]=grad[0][i]+dp[0][i-1];
        }
        for(int i=1;i<grad[0].length;i++){
            dp[i][0]=dp[i-1][0]+grad[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Math.min(dp[i-1][j]+grad[i][j],dp[i][j]+grad[i][j]);
            }
        }
        return dp[m-1][n-1];
    }
//还有一种方法能减下空间复杂度，因为我们存dp的时候每次递归一会用到两行，通过上一行来算出下一行
    public int minPathSum11(int [][]grad) {
        int m=grad.length;
        int n=grad[0].length;
        int []newline=new int [n];
        int [] oldline=new int [n];
        if(grad==null||m==0)return 0 ;
        oldline[0]=grad[0][0];
        for(int i=0;i<m;i++){
            oldline[i]=grad[0][i]+oldline[i-1]; }
        for(int i=1;i<m;i++){
            newline[0]=oldline[0]+grad[i][0];
            for(int j=1;j<n;j++){
                newline[j]=Math.min(oldline[j]+grad[i][j],newline[j-1]+grad[i][j]);
            }
            oldline=newline;
        }
        return newline[n-1];
}
}
