public class ClimbBuilding {
    public static void main(String[] args) {

        String a="";
        int b=4;
        climbBuilding(b);
        System.out.println(climb(b));
    }
    public static void climbBuilding(int n){
      String s="";
        help(n,s);
    }
    public static void help(int n,String pastway){ //pastway表示之前走了什么，n表示我还有n阶台阶要走
        if(n==1){
            System.out.println(pastway+"1 ");
            return ;
        }
        if(n==2){
            System.out.println(pastway+"1 1 ");
            System.out.println(pastway+"2 ");
        return;
        }
        else{
            String past=new String();
            past=pastway+"1 ";
            help(n-1,past);//我把走了一步的路径传进去，还剩n-1步要走
            String past2=new String();
            past2=pastway+"2 ";
            help(n-2,past2);
        }
        //一次能走一步或者两步，递归过程中就是走了一步还有n-1步要走，走了两步还有n-2步要走
        //因为一开始我们执行的并不是base case的部分，注意n的意思是还剩多少阶台阶，而不是第n阶台阶

    }
    public static int climb(int n){
        if(n==1){return 1;}
        if(n==2){return 2;}
        else{return climb(n-1)+climb(n-2);}//考虑在n的时候是来自前面哪些历史，这题是来自n-1和n-2
    }
}
