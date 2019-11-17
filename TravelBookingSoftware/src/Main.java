import javax.swing.SwingUtilities;

import GUI.App;

public class Main {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

	        @Override
	        public void run() {
	        	App mainUI = new App();
	        	mainUI.setVisible(true);
	        }
	    });
	}
}