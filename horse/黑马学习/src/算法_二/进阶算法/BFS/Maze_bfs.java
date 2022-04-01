package 算法_二.进阶算法.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Maze_bfs {
    public static void main(String[] args) {
    }
    public boolean solvemaze(char[][]maze , int startX,int StartY,int endX,int endY,boolean[][]visited){
        int xlen=maze.length;
        int ylen=maze[0].length;
        Queue<Integer> Q=new LinkedList<>();
        Q.offer(startX*ylen+StartY);
        int [] dx={-1,0,1,0};
        int [] dy={0,1,0,-1};
        while(!Q.isEmpty()){
            int temp=Q.poll();
            for(int i=0;i<4;i++){
                int nx=temp/ylen+dx[i];
                int ny=temp%ylen+dy[i];
                if(nx==endX&&ny==endY)return true;
                if(nx>=0&&ny>=0&&nx<maze.length&&ny<maze[0].length&&maze[nx][ny]=='o'&&!visited[nx][ny]){//！表示visited没走过
                    visited[nx][ny]=true;
                    Q.offer(nx*ylen+ny);
                }
            }

        }
        return false;
    }
}
