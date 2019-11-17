package GUI.formViews;

public class DeleteCompanyFormView extends FormView {

	@Override
	public void sendForm() {
		controller.deleteCompany(getForm());
	}
}
