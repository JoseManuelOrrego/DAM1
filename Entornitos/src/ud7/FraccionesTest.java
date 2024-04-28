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
	
	@Test
	void prueba10entre5Menos4entre3ShouldBe10entre50()
	{
		assertEquals(new Fracciones(10, 50), frac.Resta(new Fracciones(4,3)));
	}
	
	@Test
	void prueba10entre5Multiplica4entre3ShouldBe40entre15()
	{
		assertEquals(new Fracciones(40, 15), frac.Multi(new Fracciones(4,3)));
	}
	
	@Test
	void prueba10entre5Divide4entre3ShouldBe30entre20()
	{
		assertEquals(new Fracciones(30, 20), frac.Divi(new Fracciones(4,3)));
	}
	
	@Test
	void prueba10entre5NoEsIgual4entre3()
	{
		assertTrue(frac.esIgual(new Fracciones(4,3)) == true);
	}
}