package com.project.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test.MathUtils;

class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		int result = test.add(7,3);
		assertEquals(10, result);
	}


	@Test
	public void subtractionTest() {
		Calculator test = new Calculator();
		int result = test.subtract(4, 8);
		assertEquals(4, result);
		
	}

}

