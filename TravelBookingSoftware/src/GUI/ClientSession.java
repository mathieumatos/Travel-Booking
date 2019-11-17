package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Travel.AllJourneyVisitor;
import Travel.journeys.Journey;
import data.Observer;
import data.TravelBookingDatabase;

public class ClientSession implements ActionListener, Session, Observer {

	ClientView view;
	
	ConsultationView cv = null;

	public ClientSession() {
		this.view = new ClientView();
		view.setController(this);
		view.addCommand("Search Journeys");
		view.setVisible(true);
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command == "Take control") {
			view.setVisible(true);
			if (cv != null) {
				cv.disposeForReal();
			}
			cv = null;
		} else {
			switch (command) {
			case "Search Journeys":
				searchJourneys();
				break;
			default:
				break;
			}
		}
	}
	
	public void searchJourneys() {
		if (cv != null) {
			cv.dispose();
		}
		cv = new ConsultationView();
		cv.setController(this);
		TravelBookingDatabase db = new TravelBookingDatabase().getInstance();
		List<Journey> journeys = db.getJourneys();
		AllJourneyVisitor visitor = new AllJourneyVisitor();
		for (int i = 0; i < journeys.size(); i++) {
			journeys.get(i).accept(visitor);
			String data = visitor.getGatheredData();
			cv.addElement(data);
		}
		cv.setLocation(view.getLocation());
		view.setVisible(false);
		cv.setVisible(true);
	}
	
	@Override
	public void update() {
		if (cv == null) {
			return;
		}
		try {
			wait(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConsultationView cv2 = new ConsultationView();
		cv2.setController(this);
		TravelBookingDatabase db = new TravelBookingDatabase().getInstance();
		List<Journey> journeys = db.getJourneys();
		AllJourneyVisitor visitor = new AllJourneyVisitor();
		for (int i = 0; i < journeys.size(); i++) {
			journeys.get(i).accept(visitor);
			String data = visitor.getGatheredData();
			cv2.addElement(data);
		}
		cv2.setLocation(view.getLocation());
		cv2.setVisible(true);
		cv.disposeForReal();
		cv = cv2;
	}
}