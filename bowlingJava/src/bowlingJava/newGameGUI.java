package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class newGameGUI {
	public static void newGameFrame() {
		final JFrame newGame = new JFrame("Bowling - New Game");
		JPanel newGamePanel = new JPanel();
		newGamePanel.setLayout(new BoxLayout(newGamePanel, BoxLayout.Y_AXIS));
		
		newGame.setSize(400, 800);
		
		//Scanner input = new Scanner(System.in);
		JLabel message = new JLabel("Enter Game Name: ");
		final JTextField gameName = new JTextField();
		
		JLabel player1 = new JLabel("Enter Player 1Name: ");
		final JTextField p1 = new JTextField();
		
		JLabel player2 = new JLabel("Enter Player 2 Name: ");
		final JTextField p2 = new JTextField();
		
		
		JButton mainMenu = new JButton("Main Menu");
		mainMenu.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
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
			
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				gameGUI game = new gameGUI();
				game.setup(gameName.getText(), p1.getText(), p2.getText() );
				newGame.setVisible(false);
				
				
			}
		});
		
		
		
		newGamePanel.add(mainMenu);
		newGamePanel.add(message);
		newGamePanel.add(gameName);
		newGamePanel.add(player1);
		newGamePanel.add(p1);
		newGamePanel.add(player2);
		newGamePanel.add(p2);
		
		newGamePanel.add(startGame);
		newGame.add(newGamePanel);
		newGame.setVisible(true);
	}
}
