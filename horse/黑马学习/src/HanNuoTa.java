public class HanNuoTa {
    public static void main(String[] args) {
        int n=3;
        char a='a';
        char b='b';
        char c='c';
        System.out.println(hannuota(n));
        hannuota(n,a,b,c);
    }
    public static void hannuota(int n,char source,char space, char target){
        if(n<1){return ;}
        if(n==1){
            System.out.println(source+" move to "+target);
        }
        else{
            hannuota(n-1,source, target,space);
            System.out.println(source+" move to "+target);
            hannuota(n-1,space,source,target);
        }

    }
    public static int hannuota(int n){
        if(n==1){return 1;}
        else{return hannuota(n-1)+1+hannuota(n-1);}
    }
}
