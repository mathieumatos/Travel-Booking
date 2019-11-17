package GUI.formViews;

public class CreateCompanyFormView extends FormView {

	@Override
	public void sendForm() {
		controller.createCompany(getForm());
	}
}
