package data;

public class AdminObserver implements Observer {

	private Subject topic;
	private int state;
	
	public AdminObserver(Subject sub) {
		this.topic = sub;
	}
	
	@Override
	public void update() {
		this.state = this.topic.getState();
	}

}