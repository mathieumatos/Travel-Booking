package CommandPackage;

public interface Command {

	public boolean execute();

	public boolean undo();
	
	public String getName();
}