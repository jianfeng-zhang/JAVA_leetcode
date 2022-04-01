package 算法_二.进阶数据结构.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPatten {
    public static void main(String[] args) {

    }
    public boolean wordPatten(String pattern , String str){
        Map<Character, String> chartoward=new HashMap<>();
        Map<String, Character> wordtochar=new HashMap<>();
        String[] word=str.split( " ");
        if(word.length!=pattern.length())return false;
        for(int i=0;i<str.length();i++){
            char a=pattern.charAt(i);
            String b=word[i];
            if(!chartoward.containsKey(a)){
                chartoward.put(a,word[i]);
            }else if(!chartoward.get(a).equals(b))return false;

            if(!wordtochar.containsKey(word[i])){
                wordtochar.put(b,a);
            }else if(!wordtochar.get(b).equals(a))return false;
        }

        return true;
    }
}
