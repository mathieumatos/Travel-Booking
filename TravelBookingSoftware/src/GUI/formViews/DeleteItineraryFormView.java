package GUI.formViews;

public class DeleteItineraryFormView extends FormView {

	@Override
	public void sendForm() {
		controller.deleteItinerary(getForm());
	}
}
