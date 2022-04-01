package Java语法.字符串Builder;

public class 字符串builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder("hello21");
        sb2.append("hello22");
        System.out.println(sb2);
        sb.append("Hello");
        sb.reverse();

        System.out.println(sb);
    }

}
