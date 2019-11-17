package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JourneyConsultationView extends JFrame {

	
	JScrollPane journeyJScroll;
	JPanel journeyPanel;
	List<String> JourneyList = new ArrayList<>();
	
	
	public JourneyConsultationView() {
		setSize(300, 500);
		
		JPanel commandPanel = new JPanel();
		
		JButton searchTrips = new JButton("Search Trips");
		journeyPanel.add(searchTrips);
		
		journeyJScroll = new JScrollPane(commandPanel);
//		add(commandJScroll);
	}
	
	public void addCommand(String journeyName) {
//		JLabel commandButton = new JLabel(commandName);
//		JourneyList.add(commandName);
//		journeyPanel.add(commandButton);
	}
	
}
