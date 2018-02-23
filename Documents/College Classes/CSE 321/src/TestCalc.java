import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {

	Calc calc = new Calc();
	
	@Test
	public void testSubtract() {
		int x = 10, y = 5, z = -3, a = -4;
		assertTrue(calc.subtract(x, y) == 5);
		assertTrue(calc.subtract(y, x) == -5);
		assertTrue(calc.subtract(y, z) == 8);
		assertTrue(calc.subtract(z, a) == 1);
	}
	
	@Test
	public void testMultiply(){
		int a = 0, b = 5, c = 7, d = -3, e = -4;
		assertTrue("Positive number calc.multiply", calc.multiply(b, c) == 35);
		assertTrue("Positive and zero", calc.multiply(b, a) == 0);
		assertTrue("Negative and zero", calc.multiply(d, a) == 0);
		assertTrue("Positive and negative", calc.multiply(b, e) == -20);
		assertTrue("Negative number calc.multiply", calc.multiply(d, e) == 12);
	}
	
	@Test
	public void intTest() {
		assertEquals(Calc.divide(4,2), 2);
	}
	
	@Test
	public void notFloatTest() {
		assertNotEquals(Calc.divide(4, 2), 2.0);
	}
	
	@Test(expected = Exception.class)
	public void divideByZeroTest() {
		Calc.divide(1, 0);
	}
	@Test
	public void roundDownTest() {
		assertEquals(Calc.divide(5, 2), 2);
	}
}

