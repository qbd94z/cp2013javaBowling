package bowlingJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String gameName;
		int numOfPlayers;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Game Name: ");
		gameName = input.nextLine();
		System.out.println("Game Name is : " + gameName);
		System.out.println("Enter Number of players: ");
		numOfPlayers = input.nextInt(); // Need to validation here
		System.out.println("Number of players: " + numOfPlayers);
		
		String[] players = new String[numOfPlayers];
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.println("Player " + i + " Name: ");
			String name = input.nextLine();
			players[i] = name;
			System.out.println("Player number: " + i + " Name: " + players[i].toString());
		}
		System.out.println();
		for (int i = 0; i < players.length; i++) {
			
			System.out.println("Player number: " + i + " Name: " + players[i].toString());
			
		}
	}

}
