package bowlingJava;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class gameGUI {

	public static void setup() {
		final JFrame gameFrame = new JFrame("Bowling - Game"); 
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setPreferredSize(new Dimension(1600, 1000));
		gameFrame.pack();
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		gameFrame.add(container);
	
		
		int players = 2;
		final ArrayList<frames> playerList = new ArrayList<frames>();
		for (int i = 0; i < players; i++) {
			playerList.add(new frames());
			
		}
		
		for (frames frame : playerList) {
			container.add(frame);
		}
		
	//test
		
		frames player1 = playerList.get(0);
		frames player2 = playerList.get(1);
		//player1.setName("Ben");
		//player2.setName("George");
				
		JButton saveGame = new JButton("Save Game");
		saveGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
				saveGameGUI save = new saveGameGUI();
				save.saveGameFrame(playerList);
			}
		});
		
		JButton mainMenu = new JButton("Main Menu");
		mainMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenuGUI mm = new mainMenuGUI();
				mm.mainMenuFrame();
				gameFrame.setVisible(false);
				
			}
		});
		
		JPanel keys = new JPanel(new GridLayout(4,3));
		keys.setSize(100, 100);
		
		final JButton b1= new JButton("1");
		final JButton b2= new JButton("2");
		final JButton b3= new JButton("3");
		final JButton b4= new JButton("4");
		final JButton b5= new JButton("5");
		final JButton b6= new JButton("6");
		final JButton b7= new JButton("7");
		final JButton b8= new JButton("8");
		final JButton b9= new JButton("9");
		final JButton b0= new JButton("0");
		final JButton bhalf= new JButton("/");
		final JButton bX= new JButton("X");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getButton(b1.getText());
			}
		});
		
	b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getButton(b2.getText());
			}
		});
	
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b3.getText());
		}
	});
	
	b4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b4.getText());
		}
	});
	
	b5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b5.getText());
		}
	});
	
	b6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b6.getText());
		}
	});
	
	b7.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b7.getText());
		}
	});
	
	b8.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b8.getText());
		}
	});
	
	b9.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b9.getText());
		}
	});
	
	b0.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(b0.getText());
		}
	});
	
	bhalf.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(bhalf.getText());
		}
	});
	
	bX.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getButton(bX.getText());
		}
	});
	

	
	
		
		System.out.println("A");
		System.out.println(b1.getText());
		
		System.out.println("B");
		
		System.out.println();
		
		
		keys.add(b1);
		keys.add(b2);
		keys.add(b3);
		keys.add(b4);
		keys.add(b5);
		keys.add(b6);
		keys.add(b7);
		keys.add(b8);
		keys.add(b9);
		keys.add(b0);
		keys.add(bhalf);
		keys.add(bX);
		
	
		
		
		
		
		container.add(mainMenu);
		container.add(saveGame);
		container.add(keys);
		gameFrame.add(container);
		//gameFrame.add(keys);
		gameFrame.setVisible(true);
				
		
	}
	
	public static String getButton(String value){
		System.out.println("Button Value: " + value);
		return value;
		
	}
	
	
}
