package testa02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import a02.Bean;

public class test {
    @Test
    public void textUser() {
    	//加载spring配置文件,根据创建对象
    	ApplicationContext context=new ClassPathXmlApplicationContext("a01.xml"); 
    	//得到配置创建的文件
    	Bean bean=(Bean) context.getBean("bean");
    	System.out.println(bean);
    	bean.add();
    }
}
