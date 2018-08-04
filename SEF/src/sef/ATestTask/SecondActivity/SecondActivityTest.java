package sef.ATestTask.SecondActivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecondActivityTest{

	Calculator calc = new Calculator();

	@Test
	public void checkAddMethod() {
		double numbers[] = {1.0, 2.0, 9.0};
		assertEquals("Add numbers failed",12.0, calc.AddNumbers(numbers), 0.0);
	}

	@Test
	public void checkMultiplyMethod() {
		double numbers[] = {1.0, 2.0, 9.0};
		assertEquals("Multiply numbers failed",18.0, calc.MultiplyNumbers(numbers), 0.0);
	}

	@Test
	public void checkSubtractMethod() {
		double number1 = 997.0;
		double number2 = 222.0;
		assertEquals("Subtract numbers failed",775.0, calc.SubtractNumbers(number1, number2), 0.0);
	}

	@Test
	public void checkDivideMethod() {
		double number1 = 997.0;
		double number2 = 222.0;
		assertEquals("Divide numbers failed",4.5, calc.DivideNumbers(number1, number2), 0.1);
	}
}
