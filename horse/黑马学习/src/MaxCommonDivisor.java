
public class MaxCommonDivisor {

    public int  maxCommonDivisor(int a ,int b ){
        if(a==0){return b;}
        else if(b==0){return a;}
        else{
            int max=Math.max(a,b);
            int min=Math.min(a,b);
            int temp=max/min;
            return maxCommonDivisor(min,temp);
        }

    }

}
