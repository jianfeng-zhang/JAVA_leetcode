package 算法_二.进阶数据结构.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_withoutRepeatingCharacters {
    public static void main(String[] args) {
        //找出最长的无重复字符串
    }
    public int lengthOfLongestSubstring(String s){
        if(s==null||s.length()==0)return 0;
        int max=1;
        Map<Character, Integer> map=new HashMap<>();

        for(int i=0, j=0;i<s.length();i++ ){
            char letter=s.charAt(i);
            if(!map.containsKey(letter))
            {map.put(letter,i);
            max=Math.max(max,i-j+1);}

            else{j=Math.max(j,map.get(letter)+1);//关键的一步，得保证j不能减小
                map.put(letter,i);
                max=Math.max(max,i-j+1);
            }

        }

        return max;
    }
    public int lengthLong(String s){
        int max=0;
        int [] cache=new int[256];
        for(int i: cache){
            i=-1;
        }
        for(int i=0,j=0;i<s.length();i++){
            char c=s.charAt(i);
            if(cache[c]>=0){
                j=Math.max(j,cache[c]+1);
                cache[c]=i;
                max=Math.max(max,i-j+1);
            }else{
                cache[c]=i;
                max=Math.max(max,i-j+1);
            }
        }
        return max;
    }

}
