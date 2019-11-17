package GUI.formViews;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GUI.AdminSession;
import Travel.formModels.FormEntry;
import Travel.formModels.FormModel;

public abstract class FormView extends JFrame implements ActionListener {

	public Map<String, JTextField> fields;

	private FormModel model;

	protected AdminSession controller;

	public FormView() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void setFormModel(FormModel model) {
		this.model = model;
		fields = new HashMap<>();
		List<FormEntry> entries = new ArrayList<FormEntry>(model.getEntries().values());
		setLayout(new GridLayout(entries.size() + 1, 2));

		for (int i = 0; i < entries.size(); i++) {
			FormEntry entry = entries.get(i);
			String title = (entry.isCompulsory()) ? entry.getTitle() + "*" : entry.getTitle();

			String[] pValues = entry.getPossibleValues();
			if (pValues != null) {

				title = "(" + Arrays.toString(pValues) + ")";
			}

			JLabel label = new JLabel(title);
			JTextField tf = new JTextField();
			tf.setEditable(entry.isEditable());
			fields.put(entry.getTitle(), tf);
			add(label);
			add(tf);
		}

		JLabel label = new JLabel("* = compulsory");
		add(label);
		JButton done = new JButton("Done");
		done.addActionListener(this);
		done.setActionCommand("done");
		add(done);
	}

	public void setController(AdminSession controller) {
		this.controller = controller;
	}

	@Override
	public void dispose() {
		controller.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Take control"));
		super.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action == "done") {
			sendForm();
		}

	}

	public Map<String, String> getForm() {
		Map<String, String> values = new HashMap();
		for (String str : fields.keySet()) {
			values.put(str, fields.get(str).getText());
		}
		return values;
	}

	public void sendForm() {
		
	}

}
