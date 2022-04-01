package 算法_二.进阶数据结构.Stack;

import java.util.Stack;

public class calculation {
    public static void main(String[] args) {

    }

public int calculate(String s){
    int result=0;
    String expression =s.replace(" ", "");
    int sign =expression.charAt(0)=='-'? -1: 1 ;
    int cur=s.charAt(0)=='-'? 1:0;
    Stack<Integer> S=new Stack<>();
    while(cur<expression.length()){
        int i=cur;
        if(Character.isDigit(expression.charAt(i))){
            for(i=cur;i<expression.length();i++){
                if(!Character.isDigit(expression.charAt(i))){
                    break;}
            }
            String dig=expression.substring(cur,i);
            Integer k=Integer.valueOf(dig);
            int digital=k.intValue();
            result=result+sign*digital;
            cur=i;

        }else if(expression.charAt(i)=='+'){sign=1;cur++;}

        else if(expression.charAt(i)=='-'){sign=-1;cur++;}
        else if (expression.charAt(i)=='('){
            S.push(result);
            S.push(sign);
            result=0;
            sign=1;
            cur++;
        }
        else if(expression.charAt(i)==')'){
            result=S.pop()*result+S.pop();
            cur++;
        }
    }
        return result;
}
}
