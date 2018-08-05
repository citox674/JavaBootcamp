package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSumPositiveValue() {
		assertEquals(15.2, (theCalculator.sum(5.2, 10)));
		assertEquals(15.2, (theCalculator.sum(10, 5.2)));
	}

	@Test
	public void testSumNegativeValue() {
		assertEquals(5.5, (theCalculator.sum(-5, 10.5)));
		assertEquals(-5.5, (theCalculator.sum(5, -10.5)));
	}

	@Test
	public void testDivPositiveValue() {
		assertEquals(3.5, (theCalculator.div(7, 2)));
		assertEquals(5.0, (theCalculator.div(10, 2)));
	}

	@Test
	public void testDivNegativeValue() {
		assertEquals(-3.5, (theCalculator.div(-7, 2)));
		assertEquals(-5.0, (theCalculator.div(10, -2)));
	}

	@Test
	public void testDivZero() {
		assertEquals(Double.NaN, (theCalculator.div(0, 0)));
		assertEquals(Double.POSITIVE_INFINITY, (theCalculator.div(2, 0)));
		assertEquals(0.0, (theCalculator.div(0, 2)));
	}

	@Test
	public void testSub() {
		assertEquals(-15.2, (theCalculator.sub(-5.2, 10)));
		assertEquals(15.2, (theCalculator.sub(10, -5.2)));
	}


}

