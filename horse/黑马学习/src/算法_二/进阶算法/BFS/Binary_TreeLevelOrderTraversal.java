package 算法_二.进阶算法.BFS;



import java.util.LinkedList;
import java.util.Queue;

public class Binary_TreeLevelOrderTraversal {
    public static void main(String[] args) {

        TreeNode root=new TreeNode();
        LevelOrderTraversal(root);
    }
    public static void LevelOrderTraversal(TreeNode root){
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(Q.isEmpty()){
            TreeNode Top=Q.poll();
            if(Top.left!=null){
                Q.offer(Top.left);
            }
            if(Top.right!=null){
                Q.offer(Top.right);
            }
        }
    }

}
