package GUI.formViews;

public class CreateJourneyFormView extends FormView {

	@Override
	public void sendForm() {
		controller.createJourney(getForm());
	}
}
