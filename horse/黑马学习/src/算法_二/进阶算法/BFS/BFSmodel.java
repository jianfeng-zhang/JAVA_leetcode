package 算法_二.进阶算法.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSmodel {
    public static void main(String[] args) {
        //此model用于BFS分层
    }
    //输出一个二维矩阵，每行是树的每层
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        Q.offer(null);
        List<Integer> oneResult=new ArrayList<>();//存每一层的元素然后把oneresult加入results
        while(!Q.isEmpty()){
            TreeNode Top=Q.poll();
            if(Top==null){
                results.add(oneResult);
                if(!Q.isEmpty()){//这里判断,如果Q不是空说明后面还有Top的子节点，那我就得在他们后面加一个null表示top这一层已经走完了，不会在有和top子节点是一层的元素加进来了
                   Q.offer(null);
                }
                oneResult=new ArrayList<>();//这里是因为我前面results.add(oneresult)了所以我要重新创建一个新的oneresult去存下一层
            }else{
                if(Top.left!=null){
                    Q.offer(Top.left);
                }
                if(Top.right!=null){
                    Q.offer(Top.right);
                }
                oneResult.add(Top.val);

            }


        }
        return results;
    }
}
