package sef.module4.activity;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result); 

		Calculator calc = new Calculator();

		result = calc.divide(1,2);
		System.out.println("3) Substraction result is: " + result);

		result = calc.subtract(9,8);

		System.out.println("Substraction is: " + result);
		System.out.println("Divide is: " + result);
		System.out.println("Divide is: " + result);
	}


	

}
