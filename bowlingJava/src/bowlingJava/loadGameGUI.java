package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class loadGameGUI {
	public static void loadGameFrame() {
		final JFrame loadGame = new JFrame("Bowling - Load Game");
		JPanel loadGamePanel = new JPanel();
		
		loadGame.setSize(400, 800);
		
		JButton test = new JButton("Load Game");
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
				loadGame.setVisible(false);
				
				
			}
		});
		
		
		
		loadGamePanel.add(test);
		loadGamePanel.add(mainMenu);
		loadGame.add(loadGamePanel);
		loadGame.setVisible(true);
	}


}
