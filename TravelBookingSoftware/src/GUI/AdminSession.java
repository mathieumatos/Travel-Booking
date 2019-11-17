package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JOptionPane;

import CommandPackage.AreaCreationCommand;
import CommandPackage.AreaDeletionCommand;
import CommandPackage.Command;
import CommandPackage.CommandState;
import CommandPackage.CompanyCreationCommand;
import CommandPackage.CompanyDeletionCommand;
import CommandPackage.ItineraryCreationCommand;
import CommandPackage.ItineraryDeletionCommand;
import CommandPackage.JourneyCreationCommand;
import CommandPackage.JourneyDeletionCommand;
import GUI.formViews.CreateAreaFormView;
import GUI.formViews.CreateCompanyFormView;
import GUI.formViews.CreateItineraryFormView;
import GUI.formViews.CreateJourneyFormView;
import GUI.formViews.DeleteAreaFormView;
import GUI.formViews.DeleteCompanyFormView;
import GUI.formViews.DeleteItineraryFormView;
import GUI.formViews.DeleteJourneyFormView;
import GUI.formViews.FormView;
import Travel.formModels.CreateAreaForm;
import Travel.formModels.CreateCompanyForm;
import Travel.formModels.CreateItineraryForm;
import Travel.formModels.CreateJourneyForm;
import Travel.formModels.DeleteAreaForm;
import Travel.formModels.DeleteCompanyForm;
import Travel.formModels.DeleteItineraryForm;
import Travel.formModels.DeleteJourneyForm;
import Travel.formModels.FormModel;
import Travel.journeys.Journey;
import data.Observer;
import data.TravelBookingDatabase;

public class AdminSession implements Session, ActionListener, Observer {

	CommandState commandState;

	AdminView view;
	
	FormView formView;

	public AdminSession() {
		this.view = new AdminView();
		view.setController(this);

		commandState = new CommandState();

		addCommand("Create Company", new CompanyCreationCommand(null));
		addCommand("Create Journey", new JourneyCreationCommand(null));
		addCommand("Create Area", new AreaCreationCommand(null));
		addCommand("Create Itinerary", new ItineraryCreationCommand(null));
		addCommand("Delete Company", new CompanyDeletionCommand(null));
		addCommand("Delete Journey", new JourneyDeletionCommand(null));
		addCommand("Delete Area", new AreaDeletionCommand(null));
		addCommand("Delete Itinerary", new ItineraryDeletionCommand(null));

		view.setVisible(true);
	}

	private void addCommand(String commandTitle, Command command) {
		view.addCommand(commandTitle);
		commandState.register(command);
	}

	@Override
	public void logout() {
		view.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		// TODO : Make this beautifuller
		if (command == "Take control") {
			view.setVisible(true);
		} else {
			FormModel formModel;
			switch (command) {
			case "Create Company":
				formModel = new CreateCompanyForm();
				formView = new CreateCompanyFormView();
				break;
			case "Create Journey":
				formModel = new CreateJourneyForm();
				formView = new CreateJourneyFormView();
				break;
			case "Create Area":
				formModel = new CreateAreaForm();
				formView = new CreateAreaFormView();
				break;
			case "Create Itinerary":
				formModel = new CreateItineraryForm();
				formView = new CreateItineraryFormView();
				break;
			case "Delete Company":
				formModel = new DeleteCompanyForm();
				formView = new DeleteCompanyFormView();
				break;
			case "Delete Journey":
				formModel = new DeleteJourneyForm();
				formView = new DeleteJourneyFormView();
				break;
			case "Delete Area":
				formModel = new DeleteAreaForm();
				formView = new DeleteAreaFormView();
				break;
			case "Delete Itinerary":
				formModel = new DeleteItineraryForm();
				formView = new DeleteItineraryFormView();
				break;
			default:
				formModel = new CreateCompanyForm();
				break;
			}

			formView.setFormModel(formModel);
			formView.setController(this);
			formView.setLocation(view.getLocation());
			view.setVisible(false);
			formView.setVisible(true);
		}
	}

	private void executeCommand(Command command) {
		try {
			command.execute();
			formView.dispose();
			view.setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(formView, e.getMessage(), "Inane error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void createCompany(Map<String, String> values) {
		executeCommand(new CompanyCreationCommand(values));
	}

	public void createJourney(Map<String, String> values) {
		executeCommand(new JourneyCreationCommand(values));
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		for (Journey j : db.getJourneys()) {
			System.out.println(j.getJourneyID());
		}
	}

	public void createArea(Map<String, String> values) {
		executeCommand(new AreaCreationCommand(values));
	}

	public void createItinerary(Map<String, String> values) {
		executeCommand(new ItineraryCreationCommand(values));
	}

	@Override
	public void update() {
		
		
	}
	
	
	public void deleteCompany(Map<String,String> values) {
		executeCommand(new CompanyDeletionCommand(values));
	}
	
	public void deleteJourney(Map<String,String> values) {
		executeCommand(new JourneyDeletionCommand(values));
	}
	
	public void deleteArea(Map<String,String> values) {
		executeCommand(new AreaDeletionCommand(values));
	}
	
	public void deleteItinerary(Map<String,String> values) {
		executeCommand(new ItineraryDeletionCommand(values));
	}
}