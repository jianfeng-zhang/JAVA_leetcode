public class Binary_search_tree {
    public static void main(String[] args) {


    }
    //第一步找到这个点
    public static boolean remove(int value,TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.val == value) {
            root = removeNode(root);
            return true;
        }
        TreeNode node = root;
        while (node != null) {
            if (node.val > value) {//value的值小于结点的值
                if (node.left != null && node.left.val != value) {//如果他的左节点不等于value，那直接转移到他的左子树
                    node = node.left;
                } else if (node.left == null) {
                    return false;
                }//如果查找查到了空说明没找到，那更没法改，直接返回false
                else {//剩下就是有这个左子节点，并且他的值等于value 那就是要remove这个点了
                    node.left = removeNode(node.left);//移除这个结点并把剩下的接在这个位置上
                    return true;
                }

            }
            //然后就是往右走的情况,一样的思路
            else if (node.val < value) {
                if (node.right != null && node.right.val != value) {
                    node = node.right;
                } else if (node.right == null) return false;
                else {
                    node.right = removeNode(node.right);
                    return true;
                }
            }
            else return false;
        }
        return false;
    }


    public static TreeNode removeNode(TreeNode node){
        if(node.left==null&&node.right==null){return null;}
        else if(node.left==null) {//说明他只有右子结点
        return node.right;//直接返回他的右子结点即可
        }
        else if(node.right==null){//说明他只有左子节点
        return node.left;//直接返回他的左子结点即可
        }
        else{//有左右子结点,就是找左子里面的最大或者二又子里面的最小
            //在这个条件里
            //由于在左右结点都有的情况下删结点就是把左子节点中最大的放进来或者把右子结点中最小的放进来，所以
            //就是值的替换，把左子或者右子中的值直接放到被remove结点中，所以这个函数输出是一个int
            node.val=findAndRemove(node);
            return node;
        }
    }
    public static int findAndRemove(TreeNode node){//找左子最大的
       int result;
       //先判断这个将被remove掉的结点的左子节点有没有又结点，
       // 如果没有右节点，那这个左节点就是那个结点左边中最大的那个
       //则就把他左子节点的值放在被移除结点的值上，由于这个左子节点只有左子树，
       // 所以把Q(被移除)这个位置的左子树指针指向他左子节点的左子树
        if(node.left.right==null){
            result=node.left.val;
            node.left=node.left.left;
            return result;
        }
        //下面是左子节点的右子结点不是null的情况
        //让被删除结点等于他的左子节点
        node=node.left;
        //然后用循环找到这个结点的最右边的结点
//        while(node.right!=null){
//            node=node.right;
//        }
        //上面的这个循环是错的，我们要找的是最右边结点的父节点而不是最右端结点本身
        while(node.right.right!=null){
            node=node.right;
        }//这时node就是最右端结点的parent结点
        //我们把result赋值为最右端结点的val
        result=node.right.val;
        //这时返回result就是把这个结点的值赋给被删除结点了
        //但由于这个最右端结点可能还有自己的左子树，当这个结点赋值到上面去了之后，应该把他的左子树接到父节点的右子树上
        //这也就是为啥上面循环要的是他的parent结点
        node.right=node.right.left;
        return result;




    }
}
