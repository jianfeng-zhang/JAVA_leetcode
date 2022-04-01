package Java语法.方法重写;

    public class NewPhone extends Phone {

        @Override
        public void call() {
            System.out.println("打视频");
            super.call();
        }
    }
