package 算法_二.进阶算法.递归DFS;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        ///用最少的硬币来凑出amount
    }
    public int coinchange(int [] coin, int amount){
        if(coin==null||coin.length==0)return 0;
        Arrays.sort(coin);
        int [] min={Integer.MAX_VALUE};
        if(help(coin, amount,coin.length-1 ,0,min)){return min[0];}//一般情况下是先用大硬币，sort从小拍到大，所以index取coin.length-1
        return -1;
    }
    public boolean help(int[]coin,int rest,int index,int count,int []min){//count当前的硬币数
        if(rest<0)return false;
        if(rest==0){//这里判断结果不用index和coin的关系，因为每次coin[index]里的值可以用无数多次，而rest才是决定结果的变量，当rest<0,无论index是多少，都得退出
            if(min[0]>count){min[0]=count;
            }
            return true;
        }
        boolean result =false;
        if(count>min[0])return false; //直接截断，因为count当先硬币数已经大于min了所以之后在找下去也都是大于count
        for(int i=index;i>=0;i--){
            result=help(coin, rest-coin[i],i,count+1,min)||result;//注意这里是i不是i减1因为每个面值的硬币我们可以无限次拿，
            // 制约条件是那个rest<0 一旦拿超了让rest小于0了就直接false;
        }//这个循环范围就是
        //index-1到index    index-2到index。。。0到index
        return result;//第二点：result这里是为了循环才加的||和递归无关 ，一开始初值是false 后面一但有一个是true，则我所有的result就都输出true；
    }
}
