package by.academy.classwork;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class FirstTest extends Assert{

	@Test
	public void test1() {
		assertEquals(10, Сalculator.plus(4,6));
	}
	
	@Test
	public void test2() {
		assertEquals(3, Сalculator.division(9,3));
	}
	@Test
	public void test3() {
		assertEquals(12, Сalculator.multiplication(4, 3));
	}
	@Test
	public void test4() {
		assertEquals(-2, Сalculator.subtraction(4,6));
	}
}
