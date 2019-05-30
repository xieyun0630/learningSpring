package top.xieyun.test.Listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		NewEvent n=new NewEvent("pp", "ËïÎò¿Õ", "´óÄÖÌì¹¬");
		ctx.publishEvent(n);
	}
}
