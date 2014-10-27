package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class newGameGUI {
	public static void newGameFrame() {
		final JFrame newGame = new JFrame("Bowling - New Game");
		JPanel newGamePanel = new JPanel();
		
		newGame.setSize(400, 800);
		
		JButton test = new JButton("New Game");
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
				newGame.setVisible(false);
				
				
			}
		});
		
		JButton startGame = new JButton("Start Game");
		startGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				gameGUI game = new gameGUI();
				game.setup();
				newGame.setVisible(false);
				
				
			}
		});
		
		
		newGamePanel.add(startGame);
		newGamePanel.add(test);
		newGamePanel.add(mainMenu);
		newGame.add(newGamePanel);
		newGame.setVisible(true);
	}
}
