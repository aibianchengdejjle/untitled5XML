package practice;

public class Myservlet1 implements myservlet {

    @Override
    public void init() {
        System.out.println("1+init");
    }

    @Override
    public void service() {
        System.out.println("1+service");
    }

    @Override
    public void destory() {
        System.out.println("1+destory");
    }
}
