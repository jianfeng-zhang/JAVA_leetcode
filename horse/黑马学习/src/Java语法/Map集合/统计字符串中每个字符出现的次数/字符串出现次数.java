package Java语法.Map集合.统计字符串中每个字符出现的次数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 字符串出现次数 {
    public static void main(String[] args) {
        //由于可以把字符看成键，字符出现的字数看成值，所以可以用到HashMap
        HashMap<Character,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            Integer e=hm.get(a);
            if(e==null){
                hm.put(a,1);}else{
                e++;
                hm.put(a,e);

            }
            }
        Set<Character> h=hm.keySet();
        StringBuilder sb = new StringBuilder();
        for(Character i:h) {

            sb.append(i).append("(").append(hm.get(i)).append(")");
        }
        System.out.println(sb.toString());


        Set<Character> o=hm.keySet();
        for(Character i:o){
            System.out.print(i+"("+hm.get(i)+")");
        }

        }
    }

