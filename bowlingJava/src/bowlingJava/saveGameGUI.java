package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class saveGameGUI {
	public static void saveGameFrame() {
		final JFrame saveGame = new JFrame("Bowling - Save Game");
		JPanel saveGamePanel = new JPanel();
		
		saveGame.setSize(400, 800);
		
		JButton test = new JButton("Save Game");
		test.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				
			}
		});
		
		JButton mainMenu = new JButton("Main Menu");
		mainMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				mainMenuGUI menu = new mainMenuGUI();
				menu.mainMenuFrame();
				saveGame.setVisible(false);
				
				
			}
		});
		
		
		
		saveGamePanel.add(test);
		saveGamePanel.add(mainMenu);
		saveGame.add(saveGamePanel);
		saveGame.setVisible(true);
	}

}
