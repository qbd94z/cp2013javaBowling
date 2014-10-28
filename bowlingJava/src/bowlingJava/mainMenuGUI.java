package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainMenuGUI {
	
		public static void mainMenuFrame() {
			final JFrame mainMenu = new JFrame("Bowling - Main Menu");
			JPanel mainMenuPanel = new JPanel();
			
			mainMenu.setSize(400, 800);
			
			JButton newGame = new JButton("New Game");
			newGame.addActionListener(new ActionListener() {
				
				@SuppressWarnings("static-access")
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					newGameGUI game = new newGameGUI();
					game.newGameFrame();
					mainMenu.setVisible(false);
					
				}
			});
			
			
			
			JButton highScores = new JButton("High Scores");
			highScores.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");

					
				}
			});
			
			
			JButton loadGame= new JButton("Load Game");
			loadGame.addActionListener(new ActionListener() {
				
				@SuppressWarnings("static-access")
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					loadGameGUI load = new loadGameGUI();
					load.loadGameFrame();
					mainMenu.setVisible(false);
					
				}
			});
			
			JButton quit = new JButton("Quit");
			quit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					mainMenu.setVisible(false);
					
				}
			});
			
			
			mainMenuPanel.add(newGame);
			mainMenuPanel.add(highScores);
			mainMenuPanel.add(loadGame);
			mainMenuPanel.add(quit);
			mainMenu.add(mainMenuPanel);
			mainMenu.setVisible(true);
			
		}
		
		
		

	}
