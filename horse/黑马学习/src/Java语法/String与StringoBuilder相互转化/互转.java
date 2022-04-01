package Java语法.String与StringoBuilder相互转化;

public class 互转 {
    public static void main(String[] args) {
        String a="1efegw";

        StringBuilder aa=new StringBuilder(a);//把String类型的a 变成了StringBuilder类型的aa
        System.out.println(aa);

        String aaa=aa.toString();//把StringBuilder类型的aa，变成了String类型的aaa
        System.out.println(aaa);
    }
}
;