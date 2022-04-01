package 算法_二.进阶数据结构.树;

public class PostOrder_InOrder {
    public static void main(String[] args) {
        System.out.println(1);
    }
    public TreeNode buildTree(int []inorder, int instart,int inend,int []postorder, int poststart, int postend){
        if(instart>inend||poststart>postend){return null;}
        int k=0;
        int val=postorder[postorder.length-1];
        for(int i=0;i<inorder.length-1;i++){
            if(inorder[i]==val){k=i;break;}
        }
        TreeNode root=new TreeNode();
        root.left=buildTree(inorder,instart,k-1,postorder,poststart,k-instart+poststart);
        root.right=buildTree(inorder,k+1,inend,postorder,poststart+k-instart+1,postend-1);
        return root;
    }//主要利用K，做中序遍历  注意这里K不一定就是左子树的个数，因为有时的左子树是在中间的，所以k-1不能·代表左子树 得k-instart
}
