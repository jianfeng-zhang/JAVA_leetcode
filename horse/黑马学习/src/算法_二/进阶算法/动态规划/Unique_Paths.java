package 算法_二.进阶算法.动态规划;

public class Unique_Paths {
    public static void main(String[] args) {
        //小机器人从起始点走到终点有多少走法
        //a[i][j]=a[i-1][j]+a[i][j-1]
    }
    public int uniquePaths(int m,int n){
        int [][]a =new int [m][n];
        for(int i=0;i<m;i++){
            a[i][0]=1;

        }
        for(int i=0;i<n;i++){
            a[0][i]=1;
        }//这两个循环把矩形的上边和左边都赋值为1
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
        return a[m-1][n-1];

    }
}
