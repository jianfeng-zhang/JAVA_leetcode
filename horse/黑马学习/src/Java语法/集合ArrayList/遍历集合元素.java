package Java语法.集合ArrayList;

import java.util.ArrayList;

public class 遍历集合元素 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hwllo");
        str.add("hgesf");
        getEveryone(str);
    }

    public static void getEveryone(ArrayList<String> str) {
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}