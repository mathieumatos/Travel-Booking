package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ClientView extends JFrame {

	private JScrollPane commandJScroll;
	private JPanel commandPanel;
	Map<String,JButton> commandButtons = new HashMap<>();
	private ActionListener controller;
	
	public ClientView() {
		setSize(300, 500);
		commandPanel = new JPanel();
		commandJScroll = new JScrollPane(commandPanel);
		add(commandJScroll);
	}
	
	public void addCommand(String commandName) {
		JButton commandButton = new JButton(commandName);
		commandButton.addActionListener(controller);
		commandButton.setActionCommand(commandName);
		commandButtons.put(commandName, commandButton);
		commandPanel.add(commandButton);
	}
	
	public void setController(ActionListener controller) {
		this.controller = controller;
	}
}
