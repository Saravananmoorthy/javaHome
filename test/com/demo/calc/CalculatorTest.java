package com.demo.calc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c;

	@Before
	public void setUp() throws Exception {
		c = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testAddition() {
		Assert.assertEquals(6, c.addition(4, 2));
	}

}
