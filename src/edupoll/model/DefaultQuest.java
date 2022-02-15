package edupoll.model;

public class DefaultQuest implements Quest{

	@Override
	public int getReward() {
		int base = 1000;
		base += (int)(Math.random()*5)*10;
		return base;
	}

}
