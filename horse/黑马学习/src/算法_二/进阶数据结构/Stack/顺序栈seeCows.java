package 算法_二.进阶数据结构.Stack;

import java.util.Stack;

public class 顺序栈seeCows {
    public static void main(String[] args) {
        int []a={6,2,3,1,7,4};
        int s=seecow(a);
        System.out.println(s);
    }
    public static int  seecow(int [] cow){
        int number = 0;
        if(cow == null||cow.length ==0)return 0;
        Stack<Integer> S=new Stack<>();
        for(int i = 0; i < cow.length ; i++){
            if(S.isEmpty() || S.peek() > cow[i] ){
                S.push(cow[i]);
            }else{
                while(!S.isEmpty() && S.peek() <=cow[i]){
                    S.pop();
                    number += S.size();
                }
                S.push(cow[i]);
            }
        }
        while(!S.isEmpty()){
            S.pop();
            number += S.size();
        }
        return number;
    }
}
