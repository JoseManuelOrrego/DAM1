package ud7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FraccionesTest 
{
	Fracciones frac;
	
	@BeforeEach
	void init() 
	{
		frac = new Fracciones(10, 5);
	}
	
	@Test
	void fraccionPlusFourDivideThreeShouldBeTenDivideThree()
	{
		assertEquals(new Fracciones(50, 15), frac.Suma(new Fracciones(4,3)));
	}
}