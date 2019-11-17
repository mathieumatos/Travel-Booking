package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AdminView extends JFrame {
	
	private JScrollPane commandJScroll;
	private JPanel commandPanel;
	Map<String,JButton> commandButtons = new HashMap<>();
	ActionListener controller;
	
	public AdminView() {
		setSize(600, 300);
		commandPanel = new JPanel();
		commandPanel.setLayout(new GridLayout(3,3));
		commandJScroll = new JScrollPane(commandPanel);
		add(commandJScroll);
	}
	
	public void addCommand(String commandName) {
		JButton commandButton = new JButton(commandName);
		commandButton.setMaximumSize(new Dimension(200,20));
		commandButton.addActionListener(controller);
		commandButton.setActionCommand(commandName);
		commandButtons.put(commandName, commandButton);
		commandPanel.add(commandButton);
	}
	
	public void setController(ActionListener controller) {
		this.controller = controller;
	}

}
