package dmitriitrofimov.course;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testEvaluate() {
		Calculator calc = new Calculator();
		int sum = calc.evaluate("1+2+3");
		assertEquals(6, sum);
	}
}