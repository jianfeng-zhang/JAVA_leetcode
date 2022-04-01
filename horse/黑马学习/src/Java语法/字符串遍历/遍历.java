package Java语法.字符串遍历;

import java.util.Scanner;

public class 遍历 {
    public static void main(String[] args) {
        System.out.println("输入一段字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("您输入的字符串为："+s);
        System.out.println("他们包含的元素分别为：");
        for (int i=0;i<s.length();i++){
            System.out.print("第"+(i+1)+"个元素的值为:");
            System.out.println(s.charAt(i));
        }
    }
}
