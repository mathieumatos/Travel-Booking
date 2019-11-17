package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AdminUserGUI extends JFrame {
	
	JScrollPane commandJScroll;
	List<JButton> commandButtons = new ArrayList<>();
	
	
	public AdminUserGUI() {
		
		JPanel buttonPanel = new JPanel();
		JList list = new JList();
		commandJScroll = new JScrollPane();
	}
	
	private void createCommandButtons() {
		
	}
	
	
}
