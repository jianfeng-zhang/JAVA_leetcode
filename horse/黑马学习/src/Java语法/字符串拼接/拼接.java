package Java语法.字符串拼接;

public class 拼接 {
    public static void main(String[] args) {
        int[] arr={1,3,5};

        System.out.println(arrToString(arr));
        //这里前面必须加String 才行
       String s=arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString(int [] arr){
       String s="";

        s+="[";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];
            }else{
                s+=arr[i];
                s+=", ";
            }
        }
        s+="]";
        //结果要有返回值！！！
        return s;
    }

    }

