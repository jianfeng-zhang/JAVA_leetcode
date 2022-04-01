package 算法_二.进阶数据结构.图.图的遍历DFSBFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph {
    public static void main(String[] args) {

    }
    public UndirectedGraphNode clone(UndirectedGraphNode node){
        if(node==null)return null;
        HashMap<UndirectedGraphNode,UndirectedGraphNode> hm =new HashMap<>();
        //这里的hashmap里关系表示的是被克隆和克隆点之间的关系
        Queue<UndirectedGraphNode> q=new LinkedList<>();
        UndirectedGraphNode head= new UndirectedGraphNode(node.label);//这里定义了一个新节点head，是为了遍历之后方便直接返回head
        q.add(node);
        hm.put(node, head);
        while(!q.isEmpty()){
            UndirectedGraphNode curnode= q.poll();
            for(UndirectedGraphNode n:curnode.neighbors){//这个n是原节点里curnode的邻居
                if(!hm.containsKey(n)) {
                    q.add(n);
                    UndirectedGraphNode newneighber = new UndirectedGraphNode(n.label);
                    hm.put(n, newneighber);
                }
                //把克隆点之间的关系连接起来
                hm.get(curnode).neighbors.add(hm.get(n));//简历curnode的克隆点和他的邻居n的克隆点
            }


        }
    return head;
    }
}
