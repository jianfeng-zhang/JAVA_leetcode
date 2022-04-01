import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        int n=5;
        changeGraycode(5);
    }
    public static List<Integer> changeGraycode(int n){
        List<Integer> result=new ArrayList<>();
        changeGraycode( n, result);
    return result;
    }
    public static void changeGraycode(int n,List<Integer> result){
      if(n==0){result.add(0);return;}
      changeGraycode(n-1,result);
      int size=result.size();
      int k=1<<(n-1);
      for(int i=size-1;i>=0;i--){
          result.add(result.get(i)+k);
      }
      return;
    }
}
