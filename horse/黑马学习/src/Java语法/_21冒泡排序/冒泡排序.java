package Java语法._21冒泡排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a = {1, 4, 53, 2, 54};


        String s = ArrayToString(a);
        System.out.println("排序前" + s);

        for(int j=0;j<a.length;j++){
        for (int i=1; i< a.length-j; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }
        }
        String s1=ArrayToString(a);
        System.out.println(s1);
    }



    public static String ArrayToString(int[] arr) {
        StringBuilder a=new StringBuilder();
        a.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                a.append(arr[i]);
            } else {
                a.append(arr[i]);
                a.append(",");
            }
        }
        a.append("]");
        String s=a.toString();
        return s;
    }
}
