package Java语法.用StringBuilder进行字符串反转;

import java.util.Scanner;

public class 反转 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();

        /*StringBuilder aa=new StringBuilder(a);
        aa.reverse();
        String aaa=aa.toString();
        System.out.println(aaa);*/
        String s= new StringBuilder(a).reverse().toString();
        System.out.println(s);
    }

}
