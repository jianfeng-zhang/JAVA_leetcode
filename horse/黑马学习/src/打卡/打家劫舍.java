package 打卡;

public class 打家劫舍 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode();
        int i=rob(root);
        System.out.println(i);}

    public static int rob(TreeNode root){
        int res[]=dp(root);
        return Math.max(res[0],res[1]);
    }
    public static int[] dp(TreeNode root){
        if(root==null){return new int []{0,0};}


        int []left=dp(root.left);
        int []right=dp(root.right);

        int rob=root.val+right[0]+left[0];
        int not_Rob=Math.max(right[0],right[1])+Math.max(left[0],left[1]);


            return new int[]{rob,not_Rob};
    }
   }

