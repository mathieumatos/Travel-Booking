package data;

import java.util.HashMap;
import java.util.Map;

abstract class ModifiableDatabase<E> extends Subject implements GenericDataBase {

	Map<String, E> elements;
	private int state;

	public ModifiableDatabase() {
		super();
		elements = new HashMap<>();
	}

	public boolean modify(String key, E value) {

		if (elements.containsKey(key)) {
			elements.put(key, value);
			setState((int) value);
			return true;
		}
		setState(2);
		return false;
	}

	public boolean add(String key, E value) {

		if (elements.containsKey(key)) {
			return false;
		}
		synchronized (observers) {
			observers.notifyAll();
		}
		elements.put(key, value);
		setState(1);
		return true;
	}

	public boolean remove(String key) {
		synchronized (observers) {
			observers.notifyAll();
		}
		elements.remove(key);
		setState(3);
		return true;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
		super.notifyObs(state);
	}

}
