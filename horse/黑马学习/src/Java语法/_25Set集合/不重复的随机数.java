package Java语法._25Set集合;

import java.util.HashSet;
import java.util.Random;

import java.util.Set;
import java.util.TreeSet;

public class 不重复的随机数 {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<Integer>();
        Random r=new Random();

        while(s.size()<10){
            int number=r.nextInt(20)+1;
            s.add(number);
        }
        for(int i:s){
            System.out.println(i);
        }
        Set<Integer> a=new TreeSet<Integer>();
        while(a.size()<10){
            int number=r.nextInt(20)+1;
            a.add(number);

        }for(int i:a){
        System.out.println(i);}
    }
}
