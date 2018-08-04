package sef.ATestTask.FirstActivity;

public class Person {

//TODO 1 Implement Person Attributes
	/*1) in file Person
		1.1 Based on code implement Person attributes
		1.2 Add method for introduce of person ->
		"My name is <name> and i am <age> years old"
*/

	//Behavior - default constructor
	public Person() {
		this.firstName = "Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age) {
		this.setFirstName(firstName);
		this.secondName = secondName;
		this.age = age;
	}

	//Attributes
	private String firstName;
	private String secondName;
	private int age;

	private boolean numbersFoundInText(String text){
		if((text.indexOf('0')>-1) ||
			(text.indexOf('1')>-1) ||
			(text.indexOf('2')>-1) ||
			(text.indexOf('3')>-1) ||
			(text.indexOf('4')>-1) ||
			(text.indexOf('5')>-1) ||
			(text.indexOf('6')>-1) ||
			(text.indexOf('7')>-1) ||
			(text.indexOf('8')>-1) ||
			(text.indexOf('9')>-1))
		{
			return true;
		} else {
			return false;
		}
	}

	//Setters and getters
	public void setFirstName(String firstName)
	{
		if(numbersFoundInText(firstName)){
			throw new IllegalArgumentException("Numbers not allowed");
		}
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setSecondName(String secondName) {
		if(numbersFoundInText(secondName)){
			throw new IllegalArgumentException("Numbers not allowed");
		}
		this.secondName = secondName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String announce() {
		return "My name is " + firstName + " " + secondName + " and I am " + age + " years old.";
	}
}