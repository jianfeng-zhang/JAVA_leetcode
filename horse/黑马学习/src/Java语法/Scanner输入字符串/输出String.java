package Java语法.Scanner输入字符串;


import java.util.Scanner;

public class 输出String {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = input.nextLine();

        System.out.println("输入一个数字");
        int i=input.nextInt();
        System.out.println(i);
    }

}
