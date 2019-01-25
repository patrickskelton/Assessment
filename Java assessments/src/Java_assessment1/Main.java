package Java_assessment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Would you like to start a game?");
		System.out.println("Yes or No?");
		String decision = sc.next();
		boolean Goagain = decision.equalsIgnoreCase("yes") || decision.equalsIgnoreCase("y") ;
		if (Goagain == false) {
			System.out.println("Maybe later then");
		}
		while (Goagain) {
			Game newgame = new Game();
			
			if (newgame.askAge()) {
				newgame.trapdoor();
				if (newgame.opening()) {
					if (newgame.dragonChapter()) {
						if (newgame.MapChapter1()) {
							if (newgame.MapChapter2()) {

								if (newgame.riddle()) {
									Goagain = newgame.endgame();
								} else {
									Goagain = false;
								}
							} else {

								System.out.println("You decide to quit");
								System.out.println(
										"This doesn't really work out and you give up and travel back home. Oh well.");
								Goagain = false;
							}
						} else {
							Goagain = false;
						}
					} else {
						System.out.println("Big mistake it kills you faster than I can finish this sente..");
						Goagain = false;
					}
				} else {
					Goagain = false;
				}
			} else {
				System.out.println("Sorry your parents grounded you, maybe next year");
				Goagain = false;

			}
		}

		sc.close();
	}

}
