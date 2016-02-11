package ar.edu.unlam.tallerweb.formas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testCalcularPerimetroTriangulo() {
		Triangulo nuevoTriangulo = new Triangulo(3.00,4.00,5.00);
		Double esperado= 12.00;
		Double actual= nuevoTriangulo.calcularPerimetroTriangulo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.1);
	}
	
	@Test
	public void testCalcularAreaTriangulo() {
		Triangulo nuevoTriangulo = new Triangulo(3.00,4.00,5.00);
		Double esperado= 6.00;
		Double actual= nuevoTriangulo.calcularAreaTriangulo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.10);

	}

}
