package webmoni;

public class myservletclass implements myservlet {

    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    public void service() {
        System.out.println("servuce");
    }

    @Override
    public void destory() {
        System.out.println("destory");
    }
}
