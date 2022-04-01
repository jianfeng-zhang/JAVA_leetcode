package 打卡;

public class 找出所有质数 {
    public static void main(String[] args) {
        int n=20;
        int a=countPrimes(n);
        System.out.println(a);
    }
    public static int countPrimes(int n) {
        if(n==0||n==1){
            return 0;
        }else {
            int count=0;
            boolean[] s=new boolean[n];
            for(int i=2;i<n;i++){
                s[i]=true;
            }
            for(int i=2;i<n;i++){
                if(s[i]==true){
                    for(int g=2*i;g<n;g=g+i){
                        s[g]=false;
                    }
                }
            }
            for(int j=0;j<n;j++){
                if(s[j]==true){
                    count++;
                }
            }
            return count;
        }
    }
}
