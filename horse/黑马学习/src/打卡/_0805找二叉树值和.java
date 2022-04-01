package 打卡;

public class _0805找二叉树值和 {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){return false;}
        int sum=0;
        if(root.right==null&&root.left==null){
            return sum==targetSum;}
        else{
            return hasPathSum(root.left,targetSum-root.left.val)||hasPathSum(root.right,targetSum-root.right.val);
        }





    }
}
