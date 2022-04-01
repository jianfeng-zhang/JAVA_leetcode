package 算法_二.进阶算法.递归DFS;



public class TreeDepth {
    public int treedepth(TreeNode root){
    if(root==null){return 0;}

    return Math.max(treedepth(root.right),treedepth(root.left))+1;

}
}
