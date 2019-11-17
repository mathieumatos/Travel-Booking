package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Travel.Companies.PlaneCompany;
import data.TravelBookingDatabase;

public class App extends JFrame implements ActionListener {

	JButton instantiateClientButton;
	JButton instantiateAdminButton;
	
	public App() {
		this.setLayout(new GridLayout(1, 2));
		
		this.setSize(400, 100);
		
		instantiateClientButton = new JButton("Instanciate Client Window");
		instantiateClientButton.addActionListener(this);
		instantiateClientButton.setActionCommand("createClientWindows");
		add(instantiateClientButton);
		
		instantiateAdminButton = new JButton("Instanciate Admin Window");
		instantiateAdminButton.addActionListener(this);
		instantiateAdminButton.setActionCommand("createAdminWindows");
		add(instantiateAdminButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		
		switch (command) {
		case "createClientWindows":
			ClientSession clientSession  = new ClientSession();
			db.journeyDB.attach(clientSession);
			break;
		case "createAdminWindows":
			AdminSession adminSession  = new AdminSession();
			break;
		default:
			break;
		}
		
	}
}
