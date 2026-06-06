package com.test;

import static  java.lang.System.out;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.main.Calculator;


@DisplayName("TestCalsi")
class CalculatorTest {
	
	
	static  Calculator cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cal = new Calculator();
		
		out.println("beforeAll executed");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("afterAll executed..");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("before each executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		out.println("after each executed");
	}

	@Test
	@DisplayName("AddTest")
	void testAdd() {
		
		int actual =	cal.add(5, 5);
		
		
		assertEquals(10, actual);
		
		out.print("add() tested...");
		
	}

	@Test
	void testSub() {
		
			int actual =	cal.sub(10, 5);
			
				assertTrue(actual > 0);
				
				System.out.println("sub() tested");
		
	}

	//@Test
	//@Disabled
	@RepeatedTest(2)
	void testMul() {
		
		
		int actual =	cal.mul(3, 2);
		
			assertNotEquals(100, actual);
			
			System.out.println("mul() tested");
		
	}

	@Test
	void testDiv() {
		
		
		//int actual =	cal.div(10, 0);
		
		//	assertEquals(5, actual);
		
		
		assertThrows(ArithmeticException.class, ()->{ cal.div(10, 0); });
			
			out.print("div() tested");
		
	}

	
	
	
	@ParameterizedTest
	@ValueSource(strings = { "javeed", "narayana", "pushpalatha", "himanshu" })

		void test(String name) {

			System.out.println(name + "name tested");
			assertTrue(name.length() > 5);

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
