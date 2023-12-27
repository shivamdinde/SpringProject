package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import day7.GreetingService;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		
		String configPath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj= ctx.getBean("myBean2");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
	}
	
}
