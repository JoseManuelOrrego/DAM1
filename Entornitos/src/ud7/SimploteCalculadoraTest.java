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
}
