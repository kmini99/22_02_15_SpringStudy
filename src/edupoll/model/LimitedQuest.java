package edupoll.model;

public class LimitedQuest implements Quest {
	int valid;
	
	public LimitedQuest() {
		valid = 5;
	}
	
	public void setValid(int valid) {
		this.valid = valid;
	}
	
	@Override
	public int getReward() {
		int base = 1000;
		if(valid > 0) {
			int rst = base + valid * 300;
			valid--;
			return rst;
		}else {
			return 0;			
		}
	}

}
