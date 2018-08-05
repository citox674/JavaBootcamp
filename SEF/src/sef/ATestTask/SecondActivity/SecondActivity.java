package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println(calculator.sum(1.4, 2.5));
		System.out.println(calculator.div(3.4, 5));
		System.out.println(calculator.mult(0.8, 2));
		System.out.println(calculator.sub(4.3,6.6));

	}

	//TODO create the Calculator (here or in additional class)

	public double sum(double a, double b) {
		System.out.format("Result: %.2f + %.2f = ", a, b);
		return a + b;
	}

	public double sub(double a, double b){
		System.out.format("Result: %.2f - %.2f = ", a, b);
		return a - b;
	}

	public double mult(double a, double b){
		System.out.format("Result: %.2f * %.2f = ", a, b);
		return a * b;
	}

	public double div(double a, double b){
		System.out.format("Result: %.2f / %.2f = ", a, b);
		return a / b;
	}

}
