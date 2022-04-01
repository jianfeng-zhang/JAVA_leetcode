import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

    }
    public  static void Bfstree(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode top=q.remove();
            System.out.println(top.val);
            if(top.left!=null) {q.offer(top.left);
            
            }
            if(top.right!=null) Bfstree(top.right);

        }


    }
}
