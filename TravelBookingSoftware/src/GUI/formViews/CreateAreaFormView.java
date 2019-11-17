package GUI.formViews;

public class CreateAreaFormView extends FormView {

	@Override
	public void sendForm() {
		controller.createArea(getForm());
	}
}
