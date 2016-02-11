package ar.edu.unlam.tallerweb.formas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testCalcularAreaCirculo() {
		Circulo nuevoCirculo = new Circulo(3.00);
		Double esperado= 28.27;
		Double actual= nuevoCirculo.CalcularAreaCirculo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.01);
	}
	
	@Test
	public void testCalcularPerimetroCirculo() {
		Circulo nuevoCirculo = new Circulo(3.00);
		Double esperado= 18.84;
		Double actual= nuevoCirculo.CalcularPerimetroCirculo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.01);
	}
}
