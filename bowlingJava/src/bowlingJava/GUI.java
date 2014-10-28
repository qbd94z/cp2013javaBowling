package bowlingJava;

import javax.swing.JFrame;

public class GUI {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bowling");
		frame.pack();
		frame.setVisible(true);
		mainMenuGUI mainMenu = new mainMenuGUI();
		mainMenuGUI.mainMenuFrame();
		//Need to put this in a timer
		frame.setVisible(false);
	}
	
	
	

}
