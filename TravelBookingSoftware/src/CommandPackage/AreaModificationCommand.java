package CommandPackage;

public class AreaModificationCommand implements Command {

	private String name = "AreaModificationCommand";
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
}