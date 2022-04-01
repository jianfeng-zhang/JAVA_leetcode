package 算法_二.进阶算法.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSmodel2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>>  levelOrder(TreeNode root){
    List<List<Integer>> results=new ArrayList<>();
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            List<Integer> oneresult=new ArrayList<>();
            Queue<TreeNode> Q2=new LinkedList<>();
            while(!Q.isEmpty()){
                TreeNode Top=Q.poll();
                if(Top.left!=null)Q2.offer(Top.left);
                if(Top.right!=null)Q2.offer(Top.right);
                oneresult.add(Top.val);

            }
            results.add(oneresult);
            Q=Q2;
        }
        return results;
    }
}
