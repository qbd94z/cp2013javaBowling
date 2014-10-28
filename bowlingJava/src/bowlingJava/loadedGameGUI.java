package bowlingJava;

	import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

	import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class loadedGameGUI {

		public static void setup(final ArrayList<frames> players, String gameName) {
			final JFrame gameFrame = new JFrame("Bowling - Game"); 
			gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setPreferredSize(new Dimension(1600, 1000));
			gameFrame.pack();
			
			JPanel container = new JPanel();
			container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
			gameFrame.add(container);
		
			
			JLabel gn = new JLabel(gameName);
			container.add(gn);
			
			for (frames frame : players) {
				System.out.println("Ben Is col");
				container.add(frame);
			}
			
		//test
			
			frames player1 = players.get(0);
			frames player2 = players.get(1);
			
			
			System.out.println("Name1: " + player1.getName());
			System.out.println("Name2: " + player2.getName());
			
			
			//player1.setName(player1Data.get(0));
			
					
			JButton saveGame = new JButton("Save Game");
			saveGame.addActionListener(new ActionListener() {
				
				@SuppressWarnings("static-access")
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hello World");
					saveGameGUI save = new saveGameGUI();
					save.saveGameFrame(players, gameName);
				}
			});
			
			JButton mainMenu = new JButton("Main Menu");
			mainMenu.addActionListener(new ActionListener() {
				
				@SuppressWarnings("static-access")
				@Override
				public void actionPerformed(ActionEvent e) {
					mainMenuGUI mm = new mainMenuGUI();
					mm.mainMenuFrame();
					gameFrame.setVisible(false);
					
				}
			});
			container.add(mainMenu);
			container.add(saveGame);
			gameFrame.add(container);
			gameFrame.setVisible(true);
					
			
		}
		
		
	}



