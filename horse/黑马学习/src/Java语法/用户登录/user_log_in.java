package Java语法.用户登录;

import java.util.Scanner;

public class user_log_in {
    public static void main(String[] args) {
        String ITHM="12345";
        String CZBK="56677";
        Scanner acc = new Scanner(System.in);
        Scanner ans = new Scanner(System.in);
        for (int i=0;i<3;i++) {
            System.out.println("请输入账号");

            String s = acc.nextLine();
            System.out.println("请输入密码");

            String s1 = ans.nextLine();
            if (s.equals(ITHM)&& s1.equals(CZBK)){
                System.out.println("登录成功");
                break;
            }else if(2-i==0) {

                System.out.println("您的次数已用完");
            }else {

                    System.out.println("登录失败，您还有" + (2 - i) + "次机会");
                }
            }
        }
    }

