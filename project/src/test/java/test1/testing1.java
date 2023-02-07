package test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project1.Project1;

public class testing1 {
	
	public static Project1 objCalculator;

	@Before
	public void setup() throws Exception {

		objCalculator= new Project1();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("closing ");
	}
	@Test
	
	public void additionTest() {
		assertEquals(25, objCalculator.addition (12, 13));

	}

	@Test

	public void substractionTest() { 
		assertEquals(-1,objCalculator.substraction (12, 13));
	}


	@Test

	public void divionTest(){
		assertEquals(0,objCalculator.division(12, 13));
	}
	
	@Test
	
	public void MultiplyTest() {
		assertEquals(156,objCalculator.Multiplication (12, 13));
	}

}