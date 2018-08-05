package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

	//Attributes
	private String firstName, secondName;
	private int age;

	// Person's default constructor
	public Person() {
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	// Person's parameterized constructor
	public Person(String firstName, String secondName, int age) throws Numerals_In_Name {
		// Task 8 first name
		if (firstName.chars().allMatch(Character::isLetter))
			this.firstName = firstName;
		else throw new Numerals_In_Name("Numeral characters in first name");
		// Task 8 second name
		if (secondName.chars().allMatch(Character::isLetter))
			this.secondName = secondName;
		else throw new Numerals_In_Name("Numeral characters in second name");

		this.age = age;
	}

	// getter/setter for String firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws Numerals_In_Name {
		// Task 8, first name
		if (firstName.chars().allMatch(Character::isLetter))
			this.firstName = firstName;
		else throw new Numerals_In_Name("Numeral characters in first name");
	}

	// getter/setter for String secondName
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) throws Numerals_In_Name {
		// Task 8, second name
		if (secondName.chars().allMatch(Character::isLetter))
			this.secondName = secondName;
		else throw new Numerals_In_Name("Numeral characters in second name");
	}

	// getter/setter for int age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Person's introduction method
	public void announce() {
		System.out.println("\nMy name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");
	}

	// Task 8, exception class
	public class Numerals_In_Name extends Exception {
		public Numerals_In_Name(String message){
			super(message);
		}
	}

}

