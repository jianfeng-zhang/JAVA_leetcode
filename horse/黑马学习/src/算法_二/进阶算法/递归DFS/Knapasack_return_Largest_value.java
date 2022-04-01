package 算法_二.进阶算法.递归DFS;

public class Knapasack_return_Largest_value {
    public static int knapasack(int []weight,int index,int s){


        if(s==0){return 0;}//剩余量s为0时说明index-1时的结果就为最开始的s，直接返回0，回递归把所有weight都加回去

        else if(index==weight.length) return 0;//说明遍历所有物件，当前已经是最大值了，返回0

        else if(weight[index]>s)return knapasack(weight, index+1, s);//因为当前物品已经超了，所以直接放弃，然后执行下一个物品

        return  Math.max( knapasack(weight,index+1,s)
                //knapasack(weight,index+1,s)是直接不选  knapasack(weight,index,s-weight[index])选这个index处的值
                ,weight[index]+knapasack(weight,index,s-weight[index]));
    }           //这里吧knapasack(weight,index+1,s-weight[index]) 变成weight[index]+knapasack(weight,index+1,s-weight[index]))
                //用weight[index]存递归量，因为前面加上了weight的重量，后面就得减去weight的重量

}
