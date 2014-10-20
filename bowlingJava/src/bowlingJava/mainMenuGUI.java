package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainMenuGUI {
	
		public static void mainMenuFrame() {
			final JFrame mainMenu = new JFrame("Bowling - Main Menu");
			JPanel mainMenuPanel = new JPanel();
			
			mainMenu.setSize(400, 800);
			
			JButton newGame = new JButton("New Game");
			newGame.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					newGameGUI game = new newGameGUI();
					game.newGameFrame();
					mainMenu.setVisible(false);
					
				}
			});
			
			
			
			JButton saveGame = new JButton("Save Game");
			saveGame.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					saveGameGUI save = new saveGameGUI();
					save.saveGameFrame();
					mainMenu.setVisible(false);
					
				}
			});
			
			
			JButton loadGame= new JButton("Load Game");
			loadGame.addActionListener(new ActionListener() {
				
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
			mainMenuPanel.add(saveGame);
			mainMenuPanel.add(loadGame);
			mainMenuPanel.add(quit);
			mainMenu.add(mainMenuPanel);
			mainMenu.setVisible(true);
			
		}
		
		
		

	}
