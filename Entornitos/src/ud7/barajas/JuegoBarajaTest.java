package ud7.barajas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ud7.Fracciones;

class JuegoBarajaTest {

	Carta carta;
	
	@Test
	void constructorCartaLePasamos50LanzaExcepcion()
	{
		Exception e = assertThrows(Exception.class, () -> {
			carta = new Carta(50);
		});
		
		assertEquals("Carta nula", e.getMessage());
	}
	
	@Test
	void constructorCartaLePasamos

}
