package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class loadGameGUI {
	public static void loadGameFrame() {
		final JFrame loadGame = new JFrame("Bowling - Load Game");
		JPanel loadGamePanel = new JPanel();
		loadGamePanel.setLayout(new BoxLayout(loadGamePanel, BoxLayout.Y_AXIS));
		
		loadGame.setSize(400, 800);
		
		dbConnect connect = new dbConnect();
		connect.getGames();
		
		ArrayList gameNames = new ArrayList();
		gameNames = connect.getGames();
		
		String games = "";
		
		for (Object names : gameNames) {
			System.out.println("Names: " + names);
			games += names + "\n";
			
		}
		
		JLabel avaliableGames = new JLabel("Saved Games: ");
		JTextArea gamesList = new JTextArea();
		gamesList.setText(games);
		
		JLabel message = new JLabel("Please enter game name: ");
		final JTextArea gameName = new JTextArea();
		
		JButton test = new JButton("Load Game");
		test.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				loadGame load = new loadGame();
				load.load(gameName.getText());
				
				loadGame.setVisible(false);
				
			}
		});
		
		JButton mainMenu = new JButton("Main Menu");
		mainMenu.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				mainMenuGUI menu = new mainMenuGUI();
				menu.mainMenuFrame();
				loadGame.setVisible(false);
				
				
			}
		});
		
		
		
		
		loadGamePanel.add(mainMenu);
		loadGamePanel.add(avaliableGames);
		loadGamePanel.add(gamesList);
		
		loadGamePanel.add(message);
		loadGamePanel.add(gameName);
		
		loadGamePanel.add(test);
		loadGame.add(loadGamePanel);
		loadGame.setVisible(true);
	}


}
