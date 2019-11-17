package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ConsultationView extends JFrame {
	
	JPanel elementPanel;
	JScrollPane elementJScroll;
	List<String> journeyList = new ArrayList<>();
	protected ClientSession controller;
	
	
	public ConsultationView() {
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		elementPanel = new JPanel();
		
		elementJScroll = new JScrollPane(elementPanel);
		add(elementJScroll);
	}
	
	public void addElement(String elementName) {
		JLabel elementLabel = new JLabel(elementName);
		journeyList.add(elementName);
		elementPanel.setLayout(new GridLayout(journeyList.size(),1));
		setSize(600,40*journeyList.size());
		elementPanel.add(elementLabel);
	}
	
	@Override
	public void dispose() {
		controller.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Take control"));
		super.dispose();
	}
	
	public void disposeForReal() {
		super.dispose();
	}
	
	
	public void setController(ClientSession controller) {
		this.controller = controller;
	}
	
}
