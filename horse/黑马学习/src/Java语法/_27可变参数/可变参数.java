package Java语法._27可变参数;

public class 可变参数 {
    public static void main(String[] args) {
        System.out.println(sum(1, 4, 2, 5, 63));
    }

    public static int sum(int... a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }
}
