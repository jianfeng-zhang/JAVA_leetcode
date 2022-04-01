package 打卡;

public class 返回二叉树一定范围值的和 {
    public static void main(String[] args) {
int sum=0;

    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
           int sum=0;

        if(root==null){return 0;}
        else if(root.val>=low&&root.val<=high){
       sum=sum+root.val;
        sum=sum+rangeSumBST(root.left, low, high );
        sum=sum+rangeSumBST(root.right, low, high );

    }return sum;}
}
