package Java_assessment1;

import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	Person person = new Person("name");

	public static void line() {
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public Game() {
		line();
		System.out.println("Hello intrepid explorer what is your first name");

		String name = s.next();
		person.setPersonName(name);

		System.out.println("Hello " + name + " You have inherited a strange object from a distant relative");
		System.out.println("which you have discovered holds the location to the holy grail! With little convincing");
		System.out.println("you decifer the co-ordinates for it's location and leave on your amazing adventure.");
		line();

	}

	public boolean askAge() {
		line();
		System.out.println("How old are you?");
		int age = s.nextInt();
		person.setPersonAge(age);
		if (age >= 18) {
			return true;
		} else {
			return false;
		}

	}

	public void trapdoor() {
		line();
		System.out.println("You arrive at the location to find a trap door hidden under the exact co-ordinates!");
		System.out.println("Excitedly you try to open it but unfortunately you can't");
		System.out.println("In Despiration you look around, looking for anything helpful");
		System.out.println("TYPE north,east,west,south to move around the area ");
		line();
		int steps = 0;
		Choice trapdoor = new Choice();
		do {
			String direction = s.next();
			trapdoor.setChoiceString(direction);
			int step = trapdoor.move();
			steps= steps + step;
		} while (steps <= 3);
		line();
		System.out.println("Exhausted and convinced you're going around in circles you return to the trap door.");
		System.out.println(
				"As you watch the sun set, you notice the trapdoor starts to glow and suddenly it swings open!");
		System.out.println("The opening reveals a deep dark set of winding stone steps semmingly going on forever!");

	}

	public boolean opening() {
		line();
		System.out.println("Do you want to continue down the steps? Yes or No.");
		Choice steps = new Choice();
		String direction = s.next();
		steps.setChoiceString(direction);
		if (steps.open()) {
			line();
			System.out.println("You decide to continue your adventure down the stone steps deep underground");
			System.out.println("with nothing but your trusty flashlight to keep you company");
			line();
			System.out.println(
					"Decending down the steps you start to notice the heat and light from a distant source below you!");
			System.out.println("Only after you decend a couple more hundroud steps do you start to hear it!");
			System.out.println("Now reaching the bottom of the spiralling staircase you have no doubt in your mind!");
			System.out.println(
					"The stairs end into a massive stone floor stretching as far as you can see and in the middle");
			System.out.println("Is a dragon!");
			line();
			System.out.println("Don't worry though the dragon is sleeping and only a fool would try to wake it");
			return true;
		} else {
			line();
			System.out.println("You decide to go home. Maybe a big adventure isn't what you want after all!");
			return false;
		}
	}

	public boolean dragonChapter() {
		line();
		System.out.println("Do you wake the dragon. Yes or No");
		Choice DragonChoice = new Choice();
		String decision = s.next();
		DragonChoice.setChoiceString(decision);
		line();
		if (DragonChoice.dragonChoice()) {
			System.out.println("Well your mother always said you were a fool");
			System.out.println("you walk up confidently to the dragons face");
			System.out.println("and you kick it in the eye!!");
			return false;
		} else {
			System.out.println("Assuming the old adige DONT WAKE SLEEPING DRAGONS!");
			System.out.println("You slowly walk around the dragon");
			System.out.println(
					"On closer inspection the dragon looked so old, you doubt it could put up any good fight.");
			System.out.println("Now you have circled the dragon you can see a door behind it.");
			System.out.println("You continue through the door into the next room.");
			return true;
		}
	}

	public boolean MapChapter1() {
		line();
		System.out.println(
				"As you enter the room you notice your notice the strange object from your relative is glowing!");
		System.out.println("Ammusingly you start waving it around as you slowly walk around the room");
		System.out.println("and the object brigtens and dims accordingly.");
		System.out.println(
				"Therefore you deduce that the object can be used to find your way by going where it shines brightest.");
		System.out.println("At least it makes sense to me. Do you want to try it? Yes or No.");
		Choice MapGo = new Choice();
		String decision = s.next();
		MapGo.setChoiceString(decision);
		line();
		if (MapGo.mapGo()) {
			return true;
		} else {
			System.out.println(
					"Thinking that the narator is stupid you walk around the room for a while trying to find something");
			System.out.println("This doesn't really work out and you give up and travel back home. Oh well.");
			return false;
		}
	}

	public boolean MapChapter2() {
		line();
		System.out.println("TYPE north,east,west,south to move around the area or 'quit' if you get bored");
		ChoiceMap MapOn = new ChoiceMap();
		boolean mapDone = false;
		boolean leave = false;
		while (!mapDone || leave) {
			String decision = s.next();
			boolean stop = MapOn.mapOn(decision);
			if (MapOn.check() == 0) {
				return true;
			} else if (!stop) {
				return false;
			}
		}
		return false;
	}

	public boolean riddle() {
		line();
		System.out.println("Yes you can see somthing tiny on the floor, almost looks like a button");
		System.out.println("Instinctively you press it... CREAK!! A door opens up out of the wall");
		System.out.println("If it wasn't for the light guiding you, you may never have figured it out");
		line();
		System.out.println(
				"Now as you walk through this door you are instantly spotted by the giant SPHYX at the center of the room!");
		System.out.println(
				"However after standing there in terror for a few seconds, you realise the Sphyx is just staring at you!.");
		System.out.println("A bit confused you begin to build up the courage to speak when suddenly.");
		System.out.println("The sphyx speaks 'If you think yourself worthy of the grail, answer me this riddle.'");
		System.out.println("'Damm what is it with all these riddles!' you think to yourself.");
		System.out.println("What starts life with 4 legs grows up with 2 and finnally dies with 3 legs");
		System.out.println("your starting to think this riddles is stupid, do you answer the riddle? Yes or No.");
		Choice Riddle = new Choice();
		String decision = s.next();
		Riddle.setChoiceString(decision);
		Choice RiddleAnswer = new Choice();
		if (Riddle.riddleChoice()) {
			System.out.println("What do you think is the answer to the riddle?");
			String answer = s.next();
			RiddleAnswer.setChoiceString(answer);
			if (RiddleAnswer.riddleAnswer()) {
				System.out.println("Correct");
				System.out.println("But that was not the answer I was looking for");
				System.out.println("Before you can even muffle a protest there is a bright light");
				line();
				System.out.println("You wake up in your bed! was that all a dream?");
				return false;
			} else {
				System.out.println("'Incorrect'");
				line();
				System.out.println("Hmm I guess you died!");
				return false;
			}
		} else {
			System.out.println("I don't think this riddle is a very good test of worthyness or whatever");
			System.out
					.println("Yes and only the humble would not answer such an easy riddle just to satisfy their ego!");
			System.out.println("The Grail is behind this door! YOU MAY PASS.");
			System.out.println(
					"Although you had no idea what the answer was you happilly open the door and walk into the next room.");
			line();
			return true;
		}
	}

	public boolean endgame() {
		line();
		System.out.println("   *  ____________________  *    ");
		System.out.println("      \'                  /       ");
		System.out.println("       \'                /        ");
		System.out.println("        \'       *      /         ");
		System.out.println("         \'            /          ");
		System.out.println("          \'          /           ");
		System.out.println("           \'        /            ");
		System.out.println("     *      \'      /             ");
		System.out.println("             |     |              ");
		System.out.println("             |     |              ");
		System.out.println("             |     |         *    ");
		System.out.println("        *    |     |              ");
		System.out.println("             |     |              ");
		System.out.println("             |     |              ");
		System.out.println("==================================");
		line();
		System.out.println("You found the Holy Grail and it didn't really take that long");
		System.out.println("Finally you return home victorious but life goes on");
		System.out.println("and 10 years from now when you move house you can't seem to find it");
		System.out.println("Oh well I guess you can wait for anouther estranged relative to die.");
		line();
		System.out.println("The End");
		System.out.println("Do you want to play again?");
		String decision = s.next();
		Choice ContinueGame = new Choice();
		ContinueGame.setChoiceString(decision);
		if (ContinueGame.continueGame()) {
			return true;
		} else {
			return false;
		}
	}

}
