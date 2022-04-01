import java.util.HashSet;
import java.util.Set;

public class LongSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
    public static int help (String string){
    int max=0;
        for(int i=0;i<string.length();i++){
            Set<Character> chars=new HashSet<>();
            int j=i;
            while(j<string.length()&&!chars.contains(string.charAt(j))){//因为要的是字母不能重复
               chars.add(string.charAt(j));
               j++;
            }
            int cur=j-i;
            max=Math.max(cur,max);
        }
        return max;
    }
}
