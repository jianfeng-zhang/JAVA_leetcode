package 打卡;

public class 输入两个字符串的数组加和 {
    public static void main(String[] args) {
        String a1="11";
        String a2="123";
        String a3=addStrings(a1,a2);
        System.out.println(a3);
    }
    public static String addStrings(String num1, String num2) {

        StringBuilder s=new StringBuilder();
        int l1=num1.length()-1;
        int l2=num2.length()-1;
int carry=0;
int sum=0;
        while(l1>=0||l2>=0){
           int  x=l1>=0?num1.charAt(l1)-'0':0;
           int  y=l2>=0?num2.charAt(l2)-'0':0;
           sum=x+y+carry;
           if(sum>9){
               carry=sum/10;
               sum=sum%10;
           }
           s.append(sum);
l1--;
l2--;
        }
        if(carry!=0){
            s.append(carry);
        }

        return s.reverse().toString();
    }
}
