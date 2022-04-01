package 算法_二.进阶数据结构.Stack;

import java.util.Stack;

public class Remove_Duplicate_Letter {
    public static void main(String[] args) {
        //输出一个字符串，尽量按照字母序
    }
    public static String RemoveDuplicateLetter(String s){
        int []freq=new int[256];
        StringBuilder sb=new StringBuilder();
        Stack<Character> S=new Stack<>();
        boolean[] visited =new boolean[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++ ){
            char c=s.charAt(i);
            freq[c]--;
            if(visited[s.charAt(i)]){continue;}
            while(!S.isEmpty()&&S.peek()>s.charAt(i)&&freq[S.peek()]>0)//we need a loop in case the s element smaller than the peek again and again.
            {visited[S.pop()]=false;//如果说已经pop出去了，那就当做没访问过
            }
            S.push(s.charAt(i));
            visited[s.charAt(i)]=true;
        }
        while(!S.isEmpty()){
            sb.append(S.pop());
        }
        return sb.reverse().toString();
    }
}
