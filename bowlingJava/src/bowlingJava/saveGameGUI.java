package bowlingJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class saveGameGUI {
	public static void main(String[] args) {
		System.out.println("hello World - save game");
		
	}	
	
	public static void saveGameFrame(final ArrayList playerList) {
		final JFrame saveGame = new JFrame("Bowling - Save Game");
		JPanel saveGamePanel = new JPanel();
		
		
		
		saveGame.setSize(400, 800);
		
		JButton test = new JButton("Save Game");
		test.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				
				saveGame save = new saveGame();
				save.save(playerList);
				
			}
		});
		
		JButton mainMenu = new JButton("Close");
		mainMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveGame.setVisible(false);
				
				
			}
		});
		
		
		
		saveGamePanel.add(test);
		saveGamePanel.add(mainMenu);
		saveGame.add(saveGamePanel);
		saveGame.setVisible(true);
	}
	
	public ArrayList<String> savePlayers(ArrayList playerList){
		

	}

}
