package 算法_二.进阶数据结构.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s){
        Stack<Character> S=new Stack<>();
        if(s.length()==0)return true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){S.push(s.charAt(i));}
            else{
                if(s.charAt(i)==')'){if (S.isEmpty())return false;else if (S.pop()!='(')return false;}
                if(s.charAt(i)=='}'){if (S.isEmpty())return false;else if (S.pop()!='{')return false; }
                if(s.charAt(i)==']'){if (S.isEmpty())return false;else if (S.pop()!='[')return false; }
            }

        }
        if(!S.isEmpty())return false;//注意到最后栈必须为空才行

        return true;
    }
}
