import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {


    int[] a={3,5,3,2,4};
        List<List<Integer>> b=new ArrayList<List<Integer>>();
                b= permute(a);

    }
    public static List<List<Integer>> permute(int [] nums){
        List<List<Integer>> results=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        permute(results,nums,new ArrayList<Integer>());
        return results;
    }
    public static void  permute(List<List<Integer>> result, int []nums, ArrayList<Integer> cur){
        if(cur.size()==nums.length){
             result.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(cur.contains(nums[i])){continue;}
            cur.add(nums[i]);
            permute(result,nums,cur);
            cur.remove(cur.size()-1);
        }

        return ;

    }
}
