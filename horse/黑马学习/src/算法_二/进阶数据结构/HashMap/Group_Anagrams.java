package 算法_二.进阶数据结构.HashMap;

import java.util.*;

public class Group_Anagrams {//给一个字符串数组，需要把由相同字母组成的字符串放入一个list的输出一个list的list
    public static void main(String[] args) {
    }
    public List<List<String>> help(String [] strs){
       List<List<String>> results=new ArrayList<>();
       Map<String,List<String>> refer=new HashMap<>();
       for(String word: strs){
           char[] letter=word.toCharArray();//把字符串转化成字符数组转 xx.toCharArray();
           Arrays.sort(letter);
           String sorted=new String(letter);
           if(refer.containsKey(sorted)){//这里是contains
               refer.get(sorted).add(word);
           }else{
               List<String> temp=new ArrayList<>();
               temp.add(word);
               refer.put(sorted,temp);
           }
       }
       for(Map.Entry<String, List<String>> entry: refer.entrySet()){//xx.entrySet() 把map变成一个包含元素为键值对的集合

           results.add(entry.getValue());
        }

        return results;
    }
}
