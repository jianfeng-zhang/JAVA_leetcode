package Java语法.用StringBuilder做字符串拼接;

public class 字符串拼接 {
    public static void main(String[] args) {
        int []a={1,35,46,23};
        String b= arrToString(a);
        System.out.println(b);
    }

    public static String arrToString(int[]arr){
        StringBuilder a=new StringBuilder();
        a.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                a.append(arr[i]);
            }else{
                a.append(arr[i]).append(",");

            }
        }
        a.append("]");
        String aa=a.toString();
        return aa;
    }
}
