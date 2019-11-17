package data;

public class ClientObserver implements Observer {

	private Subject subject;
	private int state;
	
	public ClientObserver(Subject sub) {
		this.subject = sub;
	}
	
	@Override
	public void update() {
		this.state = this.subject.getState();
	}

}