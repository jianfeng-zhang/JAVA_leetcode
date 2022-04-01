package 算法_二.进阶数据结构.图.图的遍历DFSBFS;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphNode {
    int label ;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x){
        label = x ;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
