package 算法_二.进阶算法.递归DFS;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Symmetric_Tree {

    public static boolean help(TreeNode root){
        if(root==null){
            return true;
        }
        else if(root.left==null&&root.right==null)return true;
        else{
            return recursion(root.left,root.right);
        }
    }
    public static boolean recursion(TreeNode left, TreeNode right){

         if(left!=null&&right==null)return false;
        else if(left==null&&right!=null)return false;
        else if(left.val!= right.val){
            return false;
         }
        else{
            return recursion(left.left,right.right)&&recursion(left.right,right.left);
         }

    }

    //这次给的是一个collection 里面的元素和重复，，这里如果｛2，3，3，6｝ 要是9的话就有两个3，6了就错了所以要去重
    public static class Knapasack_II_without_repetition {
        public List<List<Integer>> knapsack(int target, int[] candidates) {
            Arrays.sort(candidates);//这里要排序
            List<List<Integer>> results = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            help(results, target, candidates, 0, cur);
            return results;
        }

        public void help(List<List<Integer>> results, int target, int[] candidates, int index, List<Integer> cur) {
            if (target == 0) {
                results.add(new ArrayList<>(cur));
                return;
            } else if (target < 0 || index >= candidates.length) {
                return;
            } else {
                for (int i = index; i < candidates.length; i++) {
                    help(results, target, candidates, index + 1, cur);//不选择第index类的物品
                    cur.add(candidates[index]);
                    help(results, target - candidates[index], candidates, index, cur);//选择第index类的物品
                    cur.remove(cur.size() - 1);
                    while(i<candidates.length-1&&candidates[i]==candidates[i+1]){
                       i++;//这里加1之后马上进入循环再+1
                    }
                }
                return;
            }

        }

    }
}

