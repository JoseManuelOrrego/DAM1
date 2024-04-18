package ud7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimploteCalculadoraTest 
{
	SimploteCalculadora sc;
	
	@BeforeEach
	void init()
	{
		sc = new SimploteCalculadora();
	}
	
	@Test
	void twoPlusOneMustBeThree() 
	{
		assertEquals(3, sc.add(2, 1));
	}
	
	@Test
	void minusONEminusTHREEmustBeMinusFOUR()
	{
		assertTrue(sc.add(-1, -3) == -4);
	}
	
	@Test
	void fiveMinusTwoShouldBeThree()
	{
		assertEquals(3, sc.difference(5, 2));
	}
	
	@Test
	void minusTwoMinusMinusThreeShouldBeOne()
	{
		assertTrue(sc.difference(-2, -3) == 1);
	}
	
	@Test
	void EightMultiplyNineShouldBeSeventyTwo()
	{
		assertTrue(sc.multiply(8, 9) == 72);
	}
	
	@Test
	void minusTwoMultiplyMinusFiveShouldBeTen()
	{
		assertEquals(10, sc.multiply(-2, -5));
	}
	
	@Test
	void EightDivideFourShouldBeTwo()
	{
		assertEquals(2, sc.divide(8, 4));
	}
	
	@Test
	void TenDivideMinus2ShouldBeMinusFive()
	{
		assertEquals(-5, sc.divide(10, -2));
	}
}
