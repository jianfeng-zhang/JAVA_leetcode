package 打卡;
import java.util.ArrayList;
import java.util.List;

public class 做杨辉三角 {

    List<List<Integer>> s = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return null;

        }
        List<List<Integer>> s=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            s.add(agenerate(i));
        }
        return s;
    }
        public List<Integer> agenerate(int numRows) {
        int []a=new int[numRows+1];
            List<Integer> l=new ArrayList<>();
        if(numRows==1){

            l.add(numRows);

            a[0]=1;
            for(int i=1;i<=numRows;i++){
                a[i]=l.get(i-1);
            }
            a[numRows]=1;
            return l;
            }
        else {

            for(int i=0;i<numRows;i++){

                l.add(a[i]+a[i+1]);
            }
            for(int i=1;i<numRows;i++){
                a[i]=l.get(i-1);
            }
            a[numRows]=1;
            return l;
        }

    }






    }





