package edupoll.actor;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import edupoll.model.Quest;
/*
실제 어플리케이션을 제작하다보면, 엄청나게 많은 객체들을 설계해서 사용하게 되는데
일일이 의존성 설정하는 건 개발자에게 큰 부담으로 작용한다
그래서, 몇가지 어노테이션으로 자동 inject 를 설정할 수 있다
@Autowired, @Resourse, @Inject (다 비슷함)
어노테이션은 생성자나, setter 나 필드 위 다 설정 가능하다
필드에 설정했다면, Spring 의 강력한 권한으로 매개변수형태의 주입이 아닌 다이렉트로 설정함

어노테이션 기반의 injection 설정 시에는
대부분 경우에는 Injection 받을 필드위에 선언만 해둔다
*/

public class Guild {
	
//	@Autowired, @Resource 와는 달리 @Inject 는 library 가 더 필요함
	//mvnrepository 에서 Inject 검색 후 pom.xml 에 추가
	// 3개는 약간의 차이가 존재하긴 함
	@Resource
	private Quest quest;
	
	
	public void partAct(int join) {
		System.out.println("[Guild] Start to Explore");
		int tot = 0;
		for(int cnt = 1; cnt<=join; cnt++) {
			tot += quest.getReward();
		}
		System.out.println("[Gulid] Congratulation!" + tot + "pt.");
	}
	
}

/*
 	private Quest quest;
	
	public Guild() {
	}
	
	public Guild(Quest quest) {
		this.quest = quest;
	}
	
	@Autowired
	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
	public void partAct(int join) {
		System.out.println("[Guild] Start to Explore");
		int tot = 0;
		for(int cnt = 1; cnt<=join; cnt++) {
			tot += quest.getReward();
		}
		System.out.println("[Gulid] Congratulation!" + tot + "pt.");
	}
	
 */
