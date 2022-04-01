package Java语法.String反转;

import java.util.Scanner;

public class 翻转 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        String line=s.nextLine();
        String a =reverse(line);
        System.out.println(a);
    }
    public static String reverse(String arr){
        String ss="";
        for(int i=0;i<arr.length();i++){
            ss+=arr.charAt(arr.length()-1-i);
        }
        for(int i=0;i<arr.length();i++){
        ss+=arr.charAt(arr.length()-1-i);
    }
        //函数一定要有返回值
        return ss;
    }
}
