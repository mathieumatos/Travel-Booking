package GUI.formViews;

public class DeleteJourneyFormView extends FormView {

	@Override
	public void sendForm() {
		controller.deleteJourney(getForm());
	}
}
