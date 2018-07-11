package testa03.copy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import a02.Bean1;

public class test {
    @Test
    public void textUser() {
    	//加载spring配置文件,根据创建对象
    	ApplicationContext context=new ClassPathXmlApplicationContext("a01.xml"); 
    	//得到配置创建的文件
    	Bean1 bean1=(Bean1) context.getBean("bean1");
    	System.out.println(bean1);
    	bean1.add();
    }
}
