package Java_assessment1;

public class Choice2 {
	private static int choiceInt;

	public Choice2(int input1) {

		choiceInt = input1;

	}

	public int getChoiceInt() {
		return choiceInt;
	}

	public void setChoiceInt(int choiceInt) {
		Choice2.choiceInt = choiceInt;
	}

	public boolean isOld(Person person) {
		choiceInt = person.getPersonAge();
		if (choiceInt >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
