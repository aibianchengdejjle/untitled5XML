package practice;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.print.Doc;
import java.util.List;

public class test {
    @Test
    public  void test(){
        try {
           //新建读取文件得类
           SAXReader saxReader= new SAXReader();
          // 判断是第几个
           int count=0;
            //读取文件
            Document doc= saxReader.read("src/practice/test1.xml");
            //获取根节点
            Element root=doc.getRootElement();
            //遍历xml文件获取servlet标签下的东西
            List<Element> servlet=root.elements("servlet");
            for (Element e :servlet
                 ) {
                count++;
                //获取servlet-class里面得内容
                String servletclss=e.element("servlet-class").getText();
                //利用反射来获取对象
                Class clazz=Class.forName(servletclss);
                if(count==1)
                {
                    //将对象类型实例化
                    Myservlet1 test1= (Myservlet1) clazz.newInstance();
                    test1.init();
                    test1.service();
                    test1.destory();
                }
                else{
                    Myservlet2 test2= (Myservlet2) clazz.newInstance();
                    test2.init();
                    test2.service();
                    test2.destory();
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
