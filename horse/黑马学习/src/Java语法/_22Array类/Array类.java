package Java语法._22Array类;
import java.util.Arrays;
public class Array类 {
    public static void main(String[] args) {
        int[] a={1,5,2,6};
        System.out.println("排序前"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后"+Arrays.toString(a));
    }
}
