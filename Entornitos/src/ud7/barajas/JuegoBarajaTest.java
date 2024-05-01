package ud7.barajas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ud7.Fracciones;

class JuegoBarajaTest {

	Carta carta;
	Baraja baraja;
	
	@Test
	void constructorCartaLePasamos62PaloVacio()
	{
		carta = new Carta(62);
		assertEquals(0, carta.getPalo());
	}
	
	@Test
	void constructorCartaLePasamosUnNumeroYPaloProbamosMetodos()
	{
		carta = new Carta(8,2);
		
		assertEquals("sota", carta.nombreNumero());
		assertEquals("ESPADAS", carta.nombrePalo());
		
		assertTrue(carta.valorTute() == 2);
		assertTrue(carta.valorMus() == 10);
		assertTrue(carta.valor7ymedia() == 0.5);
		
		assertEquals("sota de ESPADAS", carta.nombreCarta());
	}
	
	@Test
	void comprobamosQueSeCreanTodasLasCartasDeLaBaraja()
	{
		baraja = new Baraja();
		assertTrue(baraja.numeroCartas() == 40);
		
		Baraja baraja2 = new Baraja(2);
		assertTrue(baraja2.numeroCartas() == 80);
	}
	
	@Test
	void seBarajeanLasCartas()
	{
		Baraja baraja = new Baraja(2);
		
		Baraja barajabarajeada = new Baraja(2, true);
		
		assertNotEquals(barajabarajeada, baraja);
	}

	@Test
	void robamosCartaYesCorrecto()
	{
		baraja = new Baraja();
		carta = new Carta(1);
		
		assertEquals(carta, baraja.robar());
	}
	
	@Test
	void seCompruebaQueLaBarajaNoEstaVacia()
	{
		baraja = new Baraja();
		assertTrue(!baraja.vacia());
	}
}
