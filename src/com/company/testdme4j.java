package com.company;

import jdk.jfr.StackTrace;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import javax.xml.parsers.SAXParser;
import java.util.List;
public class testdme4j {
    @Test
    public  void testReadWebXML() throws Exception {
        SAXReader saxReader=new SAXReader();
        //获得document文档
        Document doc= saxReader.read("src/com/company/dtdtest.xml");
        //获取根元素
        Element  root= doc.getRootElement();
        //System.out.println(root.getName()); 获取web-app 标签
        //System.out.println(root.attributeValue("version")); 获取根元素中得version
        //获取根元素下的子元素
        List<Element> chiledelements= root.elements();
        //遍历list当中得元素
        for (Element e:chiledelements
        ) {
            //名字交servlet得标签
            if("servlet".equals(e.getName())){
                //获取name下面得元素
                Element servletname=  e.element("servlet-name");
                Element servletclass= e.element("servlet-class");
                System.out.println(servletclass.getText());
                System.out.println(servletname.getText());
            }
        }
    }
}
