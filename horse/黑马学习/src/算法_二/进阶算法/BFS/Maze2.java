package 算法_二.进阶算法.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int x;
    int y;
    public Pair(int a,int b ){
        x=a;
        y=b;
    }
}
public class Maze2 {
    public int findShortestWay(int [][]maze,int []start,int[] dest){
        int row=maze.length;
        int col=maze[0].length;
        int [][]distance=new int [row][col];//用来判断此点是不是需要继续往下走
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
        }
        int [] dx=new int[]{1,0,0,-1};
        int [] dy=new int []{0,-1,1,0};
        Queue<Pair> Q=new LinkedList<>();
        Q.offer(new Pair(start[0],start[1]));
        distance[start[0]][start[1]]=0;
        while(!Q.isEmpty()){
            Pair current =Q.poll();//这里的current是一对值
            for(int i=0;i<4;i++){
                int x=current.x;
                int y=current.y;
                int dist=distance[x][y];
                while(x>=0&&y>=0&&x<row&&y<col&&maze[x][y]==0) {//判断小球没越界并且这个点可以走
                    x = x + dx[i];
                    y = y + dx[i];
                    dist++;
                }
                x=x-dx[i];//
                y=y-dx[i];//
                dist--;//这三步是用来退到越界前，因为现在出循环肯定是越界了
                if(distance[x][y]>dist){//如果当前路径值dist小于distance标记的值则直接替换distance里的值
                    distance[x][y]=dist;
                }

                }

            }
            int result=distance[dest[0]][dest[1]];
            return result==Integer.MAX_VALUE? -1 : result;
        }

    }






