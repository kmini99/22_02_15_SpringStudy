package edupoll.actor;

import edupoll.model.DefaultQuest;
import edupoll.model.Quest;

/* MVC 에서 했던 Controller 와 같은 역할
   Spring DI 가 작동하는 방식(객체주입을 받는 )은 두 가지가 있는데 하나가 constructor, 다른 하나는 setter.

*/

public class Hero {
	Quest quest;
	
	public Hero() {
//		quest = new DefaultQuest();
		System.out.println("Hero()");
	}
	
	public Hero (Quest quest) { //inject by constructor (세팅을 해준다)
		this.quest = quest;
		System.out.println("Hero(Quest quest) called");
	}
	
	public void setQuest(Quest quest) {
		this.quest = quest;
		System.out.println("setQuest(Quest quest) called");
	}
	
	public void act() {
		int r = quest.getReward();
		System.out.println("[Hero] Quest Complete. (" + r + "pt)");
	}
}
