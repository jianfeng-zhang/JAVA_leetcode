package 算法_二.进阶算法.递归DFS;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

    }
    public List<List<String>> partition( String s){
        List<List<String>> results =new ArrayList<>();

        recursion(results, s, 0, new ArrayList<String>() );
        return results;
    }
    public void recursion(List<List<String>> results, String s , int index, List<String> current){
        if(index==s.length()){results.add(new ArrayList<String>(current));return;}///添加一定是添加一个新的current复刻
        for(int i=index+1;i<=s.length();i++){//注意这里的i是可以取到s.length()因为substring(a,b)中b是开区间
            String sub =s.substring(index,i);
            if(isPalindrom(sub)){
                current.add(sub);
                recursion(results,s,i+1,current);
                current.remove(current.size()-1);
            }
        }
        return ;
    }
    public boolean isPalindrom(String sub){
        for(int i=0, j=sub.length()-1 ; i<j ;i++,j--){
            if(sub.charAt(i)!=sub.charAt(j))return false;
        }
        return true;
    }
}
