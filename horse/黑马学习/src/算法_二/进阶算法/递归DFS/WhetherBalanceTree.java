package 算法_二.进阶算法.递归DFS;



public class WhetherBalanceTree {
    public static void main(String[] args) {

    }
    public boolean BalanceTree(TreeNode root){
        if(root==null){
            return true;
        }
        if(Math.abs(treedepth(root.right)-treedepth(root.left))>=2) {
            return false;
        }
        return BalanceTree(root.left)&&BalanceTree(root.right);

    }
    public int treedepth(TreeNode root){
        if(root==null){return 0;}

        return Math.max(treedepth(root.right),treedepth(root.left))+1;

    }

}
