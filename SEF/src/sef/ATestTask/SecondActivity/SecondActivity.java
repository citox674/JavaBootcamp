package sef.ATestTask.SecondActivity;
// Complete Code

import java.util.*;

public class SecondActivity {

	public static void main(String[] args) {

		//TODO Use the calculator to calculate different values
		double numbers[] = {1.0, 4.3, -9.0, 0.3, 203.7};
		double number1 = 997.0;
		double number2 = -44.97;

		double result;

		Calculator calc = new Calculator();

		System.out.println("***Add***");
		result = calc.AddNumbers(numbers);
		System.out.println(result);

		System.out.println("***Subtract***");
		result = calc.SubtractNumbers(number1, number2);
		System.out.println(result);

		System.out.println("***Multiply***");
		result = calc.MultiplyNumbers(numbers);
		System.out.println(result);

		System.out.println("***Divide***");
		result = calc.DivideNumbers(number1, number2);
		System.out.println(result);

		System.out.println("***Divide by 0***");
		try {
			number2 = 0.0;
			result = calc.DivideNumbers(number1, number2);
			System.out.println(result);
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
	}
}




