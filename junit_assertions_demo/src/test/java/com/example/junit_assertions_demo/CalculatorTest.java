package com.example.junit_assertions_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	@Disabled
	public void testAddition() {

		assertEquals(6, calculator.addition(3, 3));
	}

}
