package Java语法.猫与狗;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        a.setName("sss");
        a.setAge(5);//创建的对象a是Animal类型，所以只要把Animal的构造getset方法写出来就可以输出
        System.out.println(a.getName()+","+a.getAge());
        Animal b=new Cat("aa",34);
        System.out.println(b.getName()+","+b.getAge());


        }
    }

