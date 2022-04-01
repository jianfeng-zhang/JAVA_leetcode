package 算法_二.进阶算法.BFS;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
public class Zigzag {
    public static void main(String[] args) {

    }
    public List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> results=new ArrayList<>();
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        boolean odd=true;
        while(!Q.isEmpty()){
            List<Integer> oneresult=new ArrayList<>();
            Queue Q2=new LinkedList();
            while(!Q.isEmpty()){
                TreeNode top=Q.poll();
                if(top.left!=null)Q2.offer(top.left);
                if(top.right!=null)Q2.offer(top.right);
                oneresult.add(top.val);
            }
            Q=Q2;
            if(!odd){
                Collections.reverse(oneresult);
                odd=!odd;
            }
            results.add(oneresult);
        }

        return results;
    }

}
