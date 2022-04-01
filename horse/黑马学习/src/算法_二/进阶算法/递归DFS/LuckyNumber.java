package 算法_二.进阶算法.递归DFS;
import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static List<String> main(String[] args) {
        List<String> results= new ArrayList<>();
        String num ="";
        int target=99;


        recursion(num,target , "", 0, 0, 0,  results);
                return results;
    }
    public static void recursion(String num, int target, String temp, int pos, long current, long last, List<String> result){
        if(pos==num.length()){
            if(current==target) {result.add(temp);}
        return;
        }
        for(int i=pos;i< num.length();i++){
            if(num.charAt(pos)==0&&i!=pos)break;
            String m=num.substring(pos, i+1);
            long n=Long.valueOf(m);//n现在是获取到的值，接下来就是把current都放到n里去
            if(pos==0){
                //当pos为0也就是一开始，那因为只有一个数，所以直接把这个数用加的方法直接赋值给current就行
                recursion( num, target, temp+m, i+1, n,n,result );//这里的pos应该等于pos+i因为pos到i的值已经被粘成一个值了，所以当前位置从i+1开始
                //current 是当前值是多少，那他和target比较
            }
            else{
                recursion(num,target,temp+"+"+m,i+1,current+n,n,result );
                recursion(num,target,temp+"-"+m,i+1,current-n,-n,result);
                recursion(num,target,temp+"*"+m,i+1,current-last+last*n,last*n,result);
                if(n!=0&&last%n==0) { recursion(num,target,temp+"/"+m,i+1,current-last+last/n,last/n,result);}
            }   //这里n是有可能=0的因为上面for下面的if是会留出0的，当n为0，那就只有+-* 没有除
                //这里last%n==0 中last并不单单指的是前一个n，而是前一个增量，就算是除号前面有乘号，last也已经涵盖了，因为last是增量，
        }
    }
}
