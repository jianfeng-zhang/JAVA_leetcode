package Java语法._26泛型.泛型方法;

/*public class Generic<T> {//泛型类
    private T t;


    public Generic(T t) {
        this.t = t;
    }
}*/
public class Generic {
   public <T>void show(T t){
       System.out.println(t);
   }
}