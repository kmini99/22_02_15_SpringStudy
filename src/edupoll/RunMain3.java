package edupoll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edupoll.actor.Hero;

public class RunMain3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config-01.xml");
		
		Hero one= ctx.getBean("hero_2", Hero.class);
		Hero other = ctx.getBean("hero_2",  Hero.class);
		System.out.println("one..");
		one.act();
		one.act();
		System.out.println("other..");
		other.act();
		other.act();
		System.out.println("one..");
		one.act();
	}
}
