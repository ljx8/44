package testa01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a01.User;

public class test {
    @Test
    public void textUser() {
    	//加载spring配置文件,根据创建对象
    	ApplicationContext context=new ClassPathXmlApplicationContext("a01.xml"); 
    	//得到配置创建的文件
    	User user=(User) context.getBean("user");
    	System.out.println(user);
    	user.add();
    }
}
