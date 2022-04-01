package 打卡;

public class _0730 {
    public static void main(String[] args) {
        convertToBase7(-7);
    }
    public static String convertToBase7(int num) {
        if(num>-7&&num<7){return "num";}
        else{
            StringBuilder s=new StringBuilder();
            int b=0;
            boolean negative=false;
            if(num<0){
                negative=true;
                num=Math.abs(num);
            }
            System.out.println(num);
            while(num!=0){
                s.append(b=num%7);
                num=num/7;

            }
            if(negative){
                s.append('-');
            }



            return s.reverse().toString();
        }
    }
}
