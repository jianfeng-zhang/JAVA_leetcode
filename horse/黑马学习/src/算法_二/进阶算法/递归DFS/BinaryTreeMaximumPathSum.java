package 算法_二.进阶算法.递归DFS;



public class BinaryTreeMaximumPathSum {

    public static int help(TreeNode root){
        if(root==null)return 0;
        int []max={Integer.MIN_VALUE};

        max[0]=recursion(max,root);
        return max[0];
    }
    public static int recursion(int[] max, TreeNode root){//注意这里max不能是数字int。因为这里的max是形参，当这个函数执行完返回时
                                                            //形参是带不走的不会对主函数里的值产生影响
        if(root==null)return 0;

        int right=recursion(max,root.right);
        int left=recursion(max,root.left);
        int branchMax=root.val+Math.max(0,Math.max(right,left));
        int maxx= Math.max(branchMax, root.val+right+left);
        max[0]=Math.max(maxx,max[0]);
        return branchMax;
    }
}
