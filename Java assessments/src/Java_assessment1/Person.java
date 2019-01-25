package Java_assessment1;

public class Person {
	private String personName;
	private int personAge;

	public Person(String name) {
		personName = name;
	}

	public String toString() {
		return personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

}
