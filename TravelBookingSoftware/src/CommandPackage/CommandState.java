package CommandPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Travel.formModels.FormModel;

public class CommandState {

	private final HashMap<String, Command> commandMap = new HashMap<>();

	private List<Command> commandStack = new ArrayList<Command>();

	private Command pendingCommand = null;

	public void register(Command command) {
		commandMap.put(command.getName(), command);
	}

	public void setPendingCommand(Command command) {
		pendingCommand = command;
	}

	public Command getCommand(String commandName) {
		Command command = commandMap.get(commandName);

		if (command == null) {
			throw new IllegalStateException("no command registered for " + commandName);
		}
		return command;
	}

	public void execute() {
		try {
			pendingCommand.execute();
			commandStack.add(pendingCommand);
			pendingCommand = null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean undo() {

		return false;
	}

}