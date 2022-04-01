package 算法_二.进阶数据结构.树;



public class Preorder_Inorder {
    public static void main(String[] args) {
    }
    public TreeNode buildTree(int []preorder, int prestart, int preend ,int[]inorder,int instart,int inend){
        if(prestart>preend||instart>inend){
            return null;
        }
        int k=0;
        int val=preorder[prestart];
        TreeNode root=new TreeNode();//这里应该写val
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){ k=i;break;}
        }

        root.left=buildTree(preorder, prestart+1,prestart+(k-instart) ,inorder,instart,k+1);
        root.right=buildTree(preorder,prestart+(k-instart)+1,preend,inorder,k+1,inend);
        return root;
    }
}
