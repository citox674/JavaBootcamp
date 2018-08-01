package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
private String firstName;
private String secondName;
private int age;
	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName)  {

				if (firstName.matches(".*\\d+.*")) throw new IllegalArgumentException("Name should not contain numbers");

		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName)  {

			if (secondName.matches(".*\\d+.*"))  throw new IllegalArgumentException("Name should not contain numbers");

		this.secondName = secondName;
	}

public String introduce(){

	return   "My name is "+firstName+" "+secondName+" and i am "+age+" years old";
}
}
