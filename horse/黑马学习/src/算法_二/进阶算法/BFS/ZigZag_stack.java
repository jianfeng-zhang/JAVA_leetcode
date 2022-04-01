package 算法_二.进阶算法.BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZag_stack {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzag(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Stack<TreeNode> S=new Stack<>();
        S.push(root);
        Stack<TreeNode> S2;
        List<Integer> current;
        boolean odd=true;
        while(!S.isEmpty()){
             S2=new Stack<>();
            current=new ArrayList<>();
            while(!S.isEmpty()) {
                TreeNode now = S.pop();
                if (!odd) {
                    if (now.right != null) S2.push(now.right);//这一组先
                    if (now.left != null) S2.push(now.left);
                } else {
                    if (now.left != null) S2.push(now.left);
                    if (now.right != null) S2.push(now.right);
                }
                current.add(now.val);//这里有两个循环主要是为了同一层的所有的元素都放入current，然后再外一个循环里把carrnt放入results
            }
            odd=!odd;

            results.add(current);
            S=S2;
        }
         return results;
    }
}

