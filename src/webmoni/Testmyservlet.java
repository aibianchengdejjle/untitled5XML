package webmoni;

import org.junit.Test;

public class Testmyservlet {
    @Test
    public  void test() {
        try {
            //获得类全名
            String classname="webmoni.myservletclass";
            //通过反射来获得class对象
            Class clazz=Class.forName(classname);
            //将class对象实例化获得原来类中得方法
            myservletclass test1 =(myservletclass) clazz.newInstance();
            test1.init();
            test1.service();
            test1.destory();
        }catch (Exception e)
        {
         e.printStackTrace();
        }

    }
}
