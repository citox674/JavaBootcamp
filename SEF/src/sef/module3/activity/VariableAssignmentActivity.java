/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Declare a variable of type int and assign it default value.
		int i;
		i = 0;

		// 2- Update the value
		i = 45;

		// 3- Print updated value to the console
		System.out.println(i);
		//i = i - 10000;

		int j;
		j = 1000;
		System.out.println(j);
		i = j - i;
		System.out.println(i);




	}

}
