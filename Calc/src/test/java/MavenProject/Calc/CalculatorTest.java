package MavenProject.Calc;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class CalculatorTest extends Calculator {
	
	
	protected int value1=25;
	protected int value2=5;

	@Test
	public void testAdd() {
		Addition(value1, value2);
		assertEquals(value1+value2, result);
		 System.out.println(" this result of addition "+ result);	
	}
	
	@Test
	public void testsubtract() {
		subtraction(value1, value2);
		assertEquals(value1-value2 , result);
		System.out.println(" this result of subtraction "+ result);
	}
	
	@Test
	public void testmultiply() {
		
		Multiply(value1, value2);
		assertEquals(value1*value2, result);
		System.out.println(" this result of multiplication "+ result);

		
	}
	@Test
	public void testdivision() {
		division(value1, value2);
		assertEquals(value1/value2, result);
		 System.out.println(" this result of division "+ result);

	}
	
	

}
