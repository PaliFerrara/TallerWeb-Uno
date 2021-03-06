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
	public void testCalcularAreaTrianguloEquilatero() {
		Triangulo nuevoTriangulo = new Triangulo(6.00,6.00,6.00);
		Double esperado=15.59 ;
		Double actual= nuevoTriangulo.calcularAreaTriangulo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.01);

	}
	
	@Test
	public void testCalcularAreaTrianguloEscaleno() {
		Triangulo nuevoTriangulo = new Triangulo(5.00,6.00,7.00);
		Double esperado=14.69 ;
		Double actual= nuevoTriangulo.calcularAreaTriangulo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.01);

	}
	
	@Test
	public void testCalcularAreaTrianguloIsoceles() {
		Triangulo nuevoTriangulo = new Triangulo(5.00,5.00,8.00);
		Double esperado=12.00 ;
		Double actual= nuevoTriangulo.calcularAreaTriangulo();
		assertEquals(esperado.doubleValue(),actual.doubleValue(),0.01);

	}


}
