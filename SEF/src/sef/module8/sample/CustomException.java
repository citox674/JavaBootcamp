package sef.module8.sample;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.
	
public String  toString(){
	return "This is my exxeption message";

}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	public String getMessage() {
	String s= "Hi I am custome exeption!";
	return s;}

		//3 - Enter a message in it and return the same
		
			return null;
	}
	
	
	
	
	
}
