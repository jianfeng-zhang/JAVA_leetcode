package Java语法.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zc");
        s.setAge(555);

        System.out.println(s);//Java语法.Object.Student  @27d6c5e0
        //看某方法的源码用ctrl+B 或者右键togo -declaration

/*  public void println(Java语法.Object x) {
            String s = String. valueOf (x);   这里有一个valueOf方法，再对其看源码
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
    }
/*     public static String valueOf(Java语法.Object obj) {
            return (obj == null) ? "null" : obj.toString();
       }这里有一个toString()方法
*/
/*public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
*/
        System.out.println(s);//重写toString之后S可输出内容了Student{name='zc', age=555}
        System.out.println(s.toString());//Student{name='zc', age=555}
        //所以打印s相当于让s调用了一个toString方法
    }
}
