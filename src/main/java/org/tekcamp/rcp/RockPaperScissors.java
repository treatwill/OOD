package org.tekcamp.rcp;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		//Model the Game Rock Paper Scissors
		//Keep in mind the SOLID principles as well as the Design Patterns

		Scanner scan = new Scanner(System.in);
		Game game = new Game();
		char quit = ' ';

		while (quit != 'Q') {
			game.play();

			System.out.println("Play again? Press Q to quit and any other key to play again.");
			quit = scan.nextLine().toUpperCase().charAt(0);
		}
		scan.close();
		game.displayStats();
	}

}
