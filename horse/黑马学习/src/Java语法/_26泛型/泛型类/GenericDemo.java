package Java语法._26泛型.泛型类;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> s=new Generic<String> ();
        s.setT("name");
        System.out.println(s.getT());
        Generic <Integer>a=new Generic <>();
        a.setT(4);
        System.out.println(a.getT());
    }


}
