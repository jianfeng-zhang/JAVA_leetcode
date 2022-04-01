package 算法_二.进阶数据结构.树;

import java.util.Stack;

public class traversal_Binary_tree {
    public static void main(String[] args) {
    }
    public void front_traversal(TreeNode root)
    {
        Stack<TreeNode> S=new Stack<>();

        TreeNode newtpoint=root;
        while(!S.isEmpty()||newtpoint!=null){

            System.out.println(newtpoint.val);
            if(newtpoint.right!=null){
                S.push(newtpoint.right);
            }
            if(newtpoint.left!=null){
                newtpoint=root.left;
            }else{newtpoint=S.pop();}
        }
    }
    //中序遍历和前序不同，有根就能找到右子树所以先处理左子树再处理根在处理右子树就可
    public void inorder_traversal(TreeNode root){
    Stack<TreeNode> S=new Stack<>();
    TreeNode node=root;
    while(!S.isEmpty()||node!=null){
        if(node!=null){
        S.push(node);
        node=node.left;
        }
        else{
            node=S.pop();
            System.out.println(node.val);
            node=node.right;
        }

    }


    }

}
