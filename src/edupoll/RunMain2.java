package edupoll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edupoll.actor.Hero;

public class RunMain2 {
	public static void main(String[] args) {
		// 수동으로 Spring IOC Container 를  생성
			// Inversion Of Control (제어의 역전)
		// 참고 # web application 은 특정 위치에 bean configuration 을 잡아두면,
		// 알아서 그걸 기반으로 Spring Container 가 생성된다
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config-01.xml");
		
		//스프링 컨테이너로부터 객체를 얻어보자
		Hero h1 = (Hero)ctx.getBean("hero_1"); //이름으로 뽑으면, Object
		h1.act();
		
		/*
		Hero h2 = ctx.getBean(Hero.class); //객체타입으로 뽑을 수 있음, 하나가 아니라면 오류가 발생
		h2.act();
		*/
		System.out.println("-----------------------------------------");
		Hero h2 = ctx.getBean("hero_2", Hero.class); //같은 타입이 여러개 있더라도, 이름을 지정하면 뽑힌다
		h2.act();
		h2.act();
		h2.act();
		h2.act();
		
		System.out.println("-----------------------------------------");
		Hero h3 = ctx.getBean("hero_2", Hero.class);
		h3.act();
		h3.act();
		h3.act();
		h3.act();
		System.out.println("-----------------------------------------");
		System.out.println(h2 == h3);
	}
}
