package sef.module8.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static int test( int i, int k) {
		//1 - Type assert 5 %2 and 6%2 in separate statements

 return i/k;
	}
	public static void main(String arg[]) {
		//2 - Call test()
		Scaner input = new Scaner(System.in);
		System.out.println("Enter number for divide");
		int x = input.nextInt();
		System.out.println("Enter number for divide");
		int k = input.nextInt();
		assert k != 0 : "Youre not able to divide to 0";
		assert (x >= 0 && k > 0);
		System.out.println("result" + AssertSample.test(x, k));
	}

	}

