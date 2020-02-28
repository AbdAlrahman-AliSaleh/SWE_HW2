package CalculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Calculator.CalculatorClass;

class CalculatorClassTest {
   
    
	@Test 
	public void testTwopositiveAdd()
	{
		double expected=9.7;
		double res=CalculatorClass.addFunction(4.3,5.4);
	    assertEquals(expected,res);
	}
	@Test 
	public void testTwoNegativeAdd()
	{
		double expected=-2.7;
		double res=CalculatorClass.addFunction(-1.3,-1.4);
	    assertEquals(expected,res);
	}
	@Test 
	public void testFirstPositiveSecondNegativeAdd()
	{
		double expected= 34.4;
		double res=CalculatorClass.addFunction(44.5,-10.1);
	    assertEquals(expected,res);
	}
	@Test 
	public void testFirstNegativeAddSecondPositive()
	{
		double expected= -5.1;
		double res=CalculatorClass.addFunction(-17.2,12.1);
	    assertEquals(expected,res);
	}
	@Test 
	public void testTwoZeros()
	{
		double expected= 0;
		double res=CalculatorClass.addFunction(0,0);
	    assertEquals(expected,res);
	}
	@Test 
	public void testFirstZeroSecondPositive()
	{
		double expected= 12.5;
		double res=CalculatorClass.addFunction(0,12.5);
	    assertEquals(expected,res);
	}
	@Test 
	public void testFirstPositiveSecondZero()
	{
		double expected= 12.5;
		double res=CalculatorClass.addFunction(12.5,0);
	    assertEquals(expected,res);
	}
	
	@Test 
	public void testFirstZeroSecondNegative()
	{
		double expected= -12.5;
		double res=CalculatorClass.addFunction(0,-12.5);
	    assertEquals(expected,res);
	}
	
	@Test 
	public void testFirstNegativeSecondZero()
	{
		double expected= -12.5;
		double res=CalculatorClass.addFunction(0,-12.5);
	    assertEquals(expected,res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
