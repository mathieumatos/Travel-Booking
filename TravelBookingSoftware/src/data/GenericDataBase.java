package data;

public interface GenericDataBase {
	public boolean add();
	public boolean modify();
	public boolean remove();
	public void attach(Observer ob);
	public void detach(Observer ob);
}
