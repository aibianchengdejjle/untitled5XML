package practice;

public class Myservlet2 implements myservlet{

    @Override
    public void init() {
        System.out.println("2+init");
    }

    @Override
    public void service() {
        System.out.println("2+service");
    }

    @Override
    public void destory() {
        System.out.println("2+detory");
    }
}
