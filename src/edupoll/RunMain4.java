package edupoll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edupoll.actor.Guild;

public class RunMain4 {
	public static void main(String[] args) {
		//기존 테스트 코드를 참조해서
		//config-02 기반의 container 생성해서
		//quild 뽑아서 제대로 작동하는지 확인!
		 ApplicationContext ctx= new ClassPathXmlApplicationContext("config-02.xml");
		 
		 Guild q = ctx.getBean(Guild.class);
		 q.partAct(6);
	}
}
