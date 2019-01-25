package Java_assessment1;

public class ChoiceMap {
	private int x = 70;
	private int y = 65;
	private int yourx;
	private int youry;
	private int prevx;
	private int prevy;

	public ChoiceMap() {
		yourx=0;
		prevx=yourx;
		youry=0;
		prevy=youry;
	}

	public int check() {
		if (x == yourx && y == youry) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean mapOn(String input1) {
		if (input1.equalsIgnoreCase("north") || input1.equalsIgnoreCase("n")) {
			System.out.println("moved a few steps north");
			prevy = youry;
			youry += 5;
			if (((y - youry) * (y - youry)) < ((y - prevy) * (y - prevy))) {
				System.out.println("BRIGHTER");
			} else {
				System.out.println("DIMMER");
			}
		} else if (input1.equalsIgnoreCase("south") || input1.equalsIgnoreCase("s")) {
			System.out.println("moved a few steps south");
			prevy = youry;
			youry -= 5;
			if (((y - youry) * (y - youry)) < ((y - prevy) * (y - prevy))) {
				System.out.println("BRIGHTER");
			} else {
				System.out.println("DIMMER");
			}
		} else if (input1.equalsIgnoreCase("west") || input1.equalsIgnoreCase("w")) {
			System.out.println("moved a few steps west");
			prevx = yourx;
			yourx -= 10;
			if (((x - yourx) * (x - yourx)) < ((x - prevx) * (x - prevx))) {
				System.out.println("BRIGHTER");
			} else {
				System.out.println("DIMMER");
			}
		} else if (input1.equalsIgnoreCase("east") || input1.equalsIgnoreCase("e")) {
			System.out.println("moved a few steps east");
			prevx = yourx;
			yourx += 10;
			if (((x - yourx) * (x - yourx)) < ((x - prevx) * (x - prevx))) {
				System.out.println("BRIGHTER");
			} else {
				System.out.println("DIMMER");
			}
		} else if (input1.equalsIgnoreCase("quit")) {
			return false;
		} else {
			System.out.println("sorry what direction was that?");
		}
		return true;
	}
}
