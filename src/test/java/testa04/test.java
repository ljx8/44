package testa04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import a02.Bean;
import a03.PropertyDemo;

public class test {
    @Test
    public void textUser() {
    	//加载spring配置文件,根据创建对象
    	ApplicationContext context=new ClassPathXmlApplicationContext("a01.xml"); 
    	//得到配置创建的文件
    	PropertyDemo demo=(PropertyDemo) context.getBean("demo");
    	demo.test();
    }
}
