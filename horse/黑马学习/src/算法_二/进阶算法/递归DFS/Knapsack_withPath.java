package 算法_二.进阶算法.递归DFS;

import java.util.ArrayList;
import java.util.List;

public class Knapsack_withPath {

    public List<List<Integer>> knapsack(int target, int [] candidates){
        List<List<Integer>> results=new ArrayList< List<Integer>>();
        List<Integer> cur=new ArrayList<>();
        help(results, target, candidates, 0, cur);
        return results;
    }
    public void help(List<List<Integer>> results, int target, int [] candidates ,int index,List<Integer> cur){

        if(target==0){
            results.add(new ArrayList<>(cur));
            return;}
        else if(target<0||index>=candidates.length){return;}
        else{
            for(int i=index;i<candidates.length;i++) {
                help(results, target, candidates, index + 1, cur);//不选择第index类的物品(这句可有可无)

                cur.add(candidates[index]);
                help(results, target - candidates[index], candidates, index, cur);//选择第index类的物品
                cur.remove(cur.size() - 1);
            }
        }

    }

}
