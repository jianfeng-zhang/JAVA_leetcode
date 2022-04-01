package 算法_二.进阶数据结构.树;

public class SearchTreeFind {
    public static void main(String[] args) {

    }
    public boolean findval(TreeNode root, int target){
        TreeNode node=root;
        while(node!=null){
            if(target==node.val)return true;
            if(target>node.val){
                node=node.right;
            }
            if(target < node.val){
                node = node.left;
            }
        }
        return false;
    }
}
