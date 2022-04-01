package 打卡;
import java.util.Arrays;
public class 给小孩分饼干 {
    public static void main(String[] args) {
        int []g={1,3,6,8,2,7};
        int[] s= {1,2};
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i]<=s[j]){
                    count++;
break;
                }
            }
        }
        System.out.println(count);



    }

}
