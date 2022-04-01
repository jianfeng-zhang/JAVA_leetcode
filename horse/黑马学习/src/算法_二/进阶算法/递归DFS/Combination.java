package 算法_二.进阶算法.递归DFS;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static void main(String[] args) {

    }
    public List<List<Integer>> combin( int[] nums) {
        List<List<Integer>>  results=new ArrayList< List<Integer>>();

        help(results, nums,new ArrayList<>(),0);
        return results;
    }
    public void help(List<List<Integer>> results,int[] nums, ArrayList<Integer> cur,int index){
            if(index== nums.length){
                results.add(new ArrayList<>(cur));
                return ;
            }
        help( results, nums, cur, index+1);
        cur.add(nums[index]);
            help(results, nums, cur,index+1);
        cur.remove(cur.size()-1);
        return;
    }
}
