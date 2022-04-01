package Java语法.String对象特点;

import java.util.Arrays;

public class sTRING {
    public static void main(String[] args) {
        char[] s= {'a','b','c'};
        int [] sum={2,5,3,2,6};
        String r=new String(s);
        char[] u=r.toCharArray();
        for(char k:u){
            System.out.print(k);
        }
        char[] q={'v','1','5','c'};

        String y=new String(q);

        String s1= new String(s);
        String s2= new String(s);
        //System.out.println(s1);
        //System.out.println(s2);
        String s3="abc";
     //   System.out.println(s1.equals(s1));
    }
}
