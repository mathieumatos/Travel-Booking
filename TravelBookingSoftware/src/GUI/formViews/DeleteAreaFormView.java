package GUI.formViews;

public class DeleteAreaFormView extends FormView {

	@Override
	public void sendForm() {
		controller.deleteArea(getForm());
	}
}
