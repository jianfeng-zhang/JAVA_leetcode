package 算法_二.进阶算法.递归DFS;

public class DFS_to_maxhigh {
    public static int maxHigh(TreeNode root){
        if(root==null) return 0;
        else {
            return Math.max(maxHigh(root.left),maxHigh((root.right)))+1;
        }
    }
}
