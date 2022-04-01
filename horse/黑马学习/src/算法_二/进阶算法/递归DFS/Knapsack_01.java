package 算法_二.进阶算法.递归DFS;

public class Knapsack_01 {

    public static void main(String[] args) {
    int [] a={3,1,5,8,6,7,9};
    int s=13;
    boolean r=knapsack(13,a,0);
        System.out.println(r);

    }
    public static boolean knapsack(int s , int[] weight,int index ){
        if(s==0){return true;}
        if(s<0||index>=weight.length){return false;}
        else{
            return knapsack(s,weight,index+1)||knapsack(s-weight[index],weight,index+1);

        }
    }
}
