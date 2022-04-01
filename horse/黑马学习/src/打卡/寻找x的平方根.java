package 打卡;

import java.util.Arrays;

public class 寻找x的平方根 {  public static void main(String[] args) {
int []a={4,6,5,2,3,7};
    Arrays.sort(a);
    for(int i:a){
        System.out.print(i);
    }
    int max=a.length-1;
    int min =0;
    int m=(min+max)/2;
    int r=8;

    if(a[m]==r){
        System.out.println(true);

    }else if (a[m]>r){
        max=m-1;
        m=(max+min)/2;


    }else{min=m+1;
    m=(max+min)/2;}
}


}
