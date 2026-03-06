package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	@Test
	public void testMultiply() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(15, calc.multiply(3, 5));
	}	
	@Test
	public void testDivide() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(2, calc.divide(10, 5));
	}
	@Test
	public void testDivideByZero() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
	}
	@Test
	public void testMultiplyNegative() {
   		SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(-12, calc.multiply(-3, 4));
	}
	@Test
	public void testMultiplyByZero() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(0, calc.multiply(0, 999));
	}
	@Test
	public void testDivideNegative() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(-5, calc.divide(-10, 2));
	}
	@Test
	public void testDivideResultZero() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(0, calc.divide(1, 5));
	}
	@Test
	public void testMultiplyTwoNegatives() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(20, calc.multiply(-4, -5));
	}
	@Test
	public void testMultiplyLargeNumbers() {
    	SimpleCalculator calc = new SimpleCalculator();
    	assertEquals(1000000, calc.multiply(1000, 1000));
	}
}
