import java.util.ArrayList;
import java.util.List;

public class EightQueen {
    public static void main(String[] args) {
    char[][] b=new char[8][8];
    List<List<String>> ll=new ArrayList<>() ;
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            b[i][j]='.';
        }
    }
    eight(b,0,ll);
    }
    public static void eight(char [][]board,int row
            ,List<List<String>> results){//row是当前执行决策的是哪一行
        if(row==board.length){
            saveResult(board,results);
            return;

        }
        for(int col=0;col<board[0].length;col++){
            if(islegal(board,row,col)){
                board[row][col]='Q';
            eight(board,row+1, results);
            board[row][col]='.';
            }


        }
        return;

    }
    public static boolean islegal(char [][]board,int row ,int col){
        for(int i=row-1;i>=0;i--)
        {   if(board[i][col]=='Q'){return false;}
            int tempcol=col+(row-i);
            if(tempcol>=0&&tempcol<board[0].length&&board[i][tempcol]=='Q')
            //因为只判断对角线元素，不判断其他元素所以有tempcol>=0&&tempcol<board[0].length
            {return false;}
            int tempcol2=col-(row-i);
            if(tempcol2>=0&&tempcol2<board[0].length&&board[i][tempcol2]=='Q'){return false;}
        }
        return true;

    }
    public static void saveResult(char[][] board,List<List<String>> results){
        List <String>result=new ArrayList<>();
       for(int i=0;i<board.length;i++){

       result.add(new String (board[i]));
       }
       results.add(result);

    }
}
