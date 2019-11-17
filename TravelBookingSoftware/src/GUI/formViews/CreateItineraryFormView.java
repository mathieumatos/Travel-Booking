package GUI.formViews;

public class CreateItineraryFormView extends FormView {

	@Override
	public void sendForm() {
		controller.createItinerary(getForm());
	}
}
