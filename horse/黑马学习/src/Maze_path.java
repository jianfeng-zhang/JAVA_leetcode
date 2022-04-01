import java.util.ArrayList;
import java.util.Arrays;

public class Maze_path {
    public static void main(String[] args) {

    }
    public static boolean maze(char[][] m, int startx, int starty , int endx, int endy, ArrayList<Character> path){
        if(startx==endx&&starty==endy){
            System.out.println(path);
            return true;
        }
        else if(startx<0||startx>=m.length||starty<0||starty>=m[0].length||m[startx][starty]=='X'){
            return false;
        }
        char[] direction={'D','R','U','L'};
        m[startx][starty]='X';
        int [] dx={1,0,-1,0};
        int [] dy={0,1,0,-1};
        for(int i=0;i<direction.length;i++){
            path.add(direction[i]);
            if(maze(m,startx+dx[i],starty+dy[i],endx,endy,path)){return true;}
            path.remove(path.size()-1);
        }
        return false;
    }
}
