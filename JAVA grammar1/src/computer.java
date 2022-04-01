
public class computer{
    public static void main(String[] args) {
        int x=0;
        for(int i=100;i<1000;i++){
            int a=i%10;

            int b=i/10%10;
            int c=i/10/10;
            if(i==a*a*a+b*b*b+c*c*c){
                x++;
            }
        } System.out.println("水仙花总数为"+x);
            }


    }
