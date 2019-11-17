package data;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	protected List<Observer> observers = new ArrayList<Observer>();
	protected int state;
	
	public Subject() {
		ClientObserver clientObs = new ClientObserver(this);
		AdminObserver adminObs = new AdminObserver(this);
		
		observers.add(clientObs);
		observers.add(adminObs);
	}
	
	
	public void notifyObs(int state) {
		this.state = state;
		for(Observer o : observers) {
			o.update();
		}
	}
	
	public int getState() {
		return this.state;
	}
}
