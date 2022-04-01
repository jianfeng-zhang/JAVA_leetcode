public class Maze {
    public static void main(String[] args) {

    }
    public boolean maze(char[][] m,int startX ,int startY,int endX,int endY,boolean[][] visited){
        if(startX==endX&&startY==endY){return true;}
        if(startX<0||startY<0||startY>=m[0].length||startX>=m.length||m[startX][startY]=='X'||visited[startX][startY]){return false;}


        visited[startX][startY]= true;//这句就是防止每条递归的路线往回走，比如他是从(0，0)开始走，
        //给(0,0)赋值ture;则当点到(0,1)的时候, 由于00点是ture,他就不会走00点了,递归线路没有往返走的情况
        if(maze(m,startX+1,startY,endX,endY,visited)||maze(m,startX,startY+1,endX,endY,visited)
                ||maze(m,startX-1,startY,endX,endY,visited)||maze(m,startX,startY-1,endX,endY,visited)){
            return true;
        }
        return false;
    }
}
