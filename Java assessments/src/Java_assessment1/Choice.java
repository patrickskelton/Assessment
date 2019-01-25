package Java_assessment1;

public class Choice {
	private static String choiceString;

	public Choice() {

	}

	public static String getChoiceString() {
		return choiceString;
	}

	public void setChoiceString(String choiceString) {
		Choice.choiceString = choiceString;
	}

	public int move() {
		if (choiceString.equalsIgnoreCase("north") || choiceString.equalsIgnoreCase("n")) {
			System.out.println("moved a few steps north");
			return 1;
		} else if (choiceString.equalsIgnoreCase("south") || choiceString.equalsIgnoreCase("s")) {
			System.out.println("moved a few steps south");
			return 1;
		} else if (choiceString.equalsIgnoreCase("west") || choiceString.equalsIgnoreCase("w")) {
			System.out.println("moved a few steps west");
			return 1;
		} else if (choiceString.equalsIgnoreCase("east") || choiceString.equalsIgnoreCase("e")) {
			System.out.println("moved a few steps east");
			return 1;
		}else if (choiceString.equalsIgnoreCase("quit") || choiceString.equalsIgnoreCase("q")) {
			System.out.println("you decide to quit this");
			return 6;
		}else {
			System.out.println("sorry what direction was that?");
			return 0;
		}
	}

	public boolean open() {
		if (choiceString.equalsIgnoreCase("yes") || choiceString.equalsIgnoreCase("y")) {
			return true;
		} else if (choiceString.equalsIgnoreCase("no") || choiceString.equalsIgnoreCase("n")) {
			return false;
		} else {
			return false;
		}
	}

	public boolean dragonChoice() {
		if (choiceString.equalsIgnoreCase("yes") || choiceString.equalsIgnoreCase("y")) {
			return true;
		} else if (choiceString.equalsIgnoreCase("no") || choiceString.equalsIgnoreCase("n")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean mapGo() {
		if (choiceString.equalsIgnoreCase("yes") || choiceString.equalsIgnoreCase("y")) {
			return true;
		} else if (choiceString.equalsIgnoreCase("no") || choiceString.equalsIgnoreCase("n")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean riddleChoice() {
		if (choiceString.equalsIgnoreCase("yes") || choiceString.equalsIgnoreCase("y")) {
			return true;
		} else if (choiceString.equalsIgnoreCase("no") || choiceString.equalsIgnoreCase("n")) {
			return false;
		} else {
			return false;
		}
	}

	public boolean riddleAnswer() {
		if (choiceString.equalsIgnoreCase("man") || choiceString.equalsIgnoreCase("mankind")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean continueGame() {
		if (choiceString.equalsIgnoreCase("yes") || choiceString.equalsIgnoreCase("y")) {
			return true;
		} else if (choiceString.equalsIgnoreCase("no") || choiceString.equalsIgnoreCase("n")) {
			return false;
		} else {
			return false;
		}
	}

}
