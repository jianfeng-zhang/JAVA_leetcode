package 算法_二.进阶算法.BFS;

import java.util.*;

public class Word_Ladder {
    public static void main(String[] args) {

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String > wordSet =new HashSet<>();
        for(String word:wordList){
            wordSet.add(word);
        }
        Queue<String> Q= new LinkedList<>();
        Q.offer(beginWord);

        Set<String> visited= new HashSet<>();//一定要放一个visited set 防止Q无限循环
        visited.add(beginWord);
        int distance=1; //这题的初始单词也算一个距离所以为1
        while (!Q.isEmpty()){
            distance++;
            Queue<String> Q2=new LinkedList<>();//双Q中第一层while循环只要
            // 1 创建第二个Q2 2. 根据题义把历史加进去eg需要输入路径就传一个List<List<xx>>,需要一个值（距离啥的）就放一个int
            //只有在第二个while里才是执行poll之类的函数
            while(!Q.isEmpty()){
            String newWord=Q.poll();
            List<String> wordsinDistance=getWordsWithinDistance(wordSet,newWord);
            //getWordsWithinDistance()函数是为了找出wordSet中和当前word差一个字母的所有word
            for(String word:wordsinDistance){
                if(word==endWord){ return distance; }
                if(!visited.contains(word)){//如果这个word之前没有访问过
                    Q2.add(word);
                    visited.add(word);
                }
            }

            }
            Q=Q2;  //在两循环之间改变Q
        }
        return 0 ;
    }
    public List<String> getWordsWithinDistance(Set<String> Set, String top){//找出和当前单词差一个字母的所有单词并且放到一个集合并输出
        List<String> l=new ArrayList<>();
        return l;
    }
}
