package 打卡;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 数组出数字 {
    public static void main(String[] args) {
        int []A = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> c =new ArrayList<>();


        c=addToArrayForm(A,1);
        System.out.println(c);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> b =new ArrayList<>();


            int sum =0;
            for(int i=0;i<num.length;i++){

                sum= num[i]+sum*10;
            }
            sum= sum+k;
            int a=sum*10;
        System.out.println(sum);
            while(a/10!=0) {
                b.add(sum % 10);

                a=a/10;
                sum=sum/10;
            }
            Collections.reverse(b);
            return b;
    }
}
