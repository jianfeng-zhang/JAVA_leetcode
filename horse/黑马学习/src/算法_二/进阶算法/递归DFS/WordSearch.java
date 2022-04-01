package 算法_二.进阶算法.递归DFS;

public class WordSearch {
    public static void main(String[] args) {

    }
    public boolean search(char[][] board, String word){
        if(board.length==0||board[0].length==0)return false;
        boolean [][] flag=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
            flag[i][j]=true;}
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(recursion(board,i,j,flag,word,0 )==true)return true;
            }
        }
        return false;
    }
    public boolean recursion(char[][]board,int x,int y,boolean[][] flag,String word,int index){//这里的index是为了标记搜索到word1的的第几个元素了
        if(index==word.length())return true;
        else if(x<0||y<0||x>board.length||y>board[0].length||flag[x][y]==false||word.charAt(index)!=board[x][y])return false;
       flag[x][y]=false;
        boolean result=recursion(board,x+1,y,flag,word,index)||
        recursion(board,x-1,y,flag,word,index)||
        recursion(board,x,y+1,flag,word,index)||
        recursion(board,x,y-1,flag,word,index);
        if(result)return result;
        else{
            flag[x][y]=true;//第30句和第32句都必须在这个题里写，因为这个题要求路径必须有顺序（按照word的顺序）所以可能同一个点不同的走法结果不一样
            //而迷宫问题的路径是没有顺序的，在任何情况下，一个点走不通，那在其他的回溯路径上看，他也还是走不通
            //这里还有一个事，当我们不需要打印路程的时候，是可以不加回溯的，
            // 因为lag[x][y]=true;这一句的目的是为了还原之前的改变，为的就是打印路程
            return false;
        }
    }
}
