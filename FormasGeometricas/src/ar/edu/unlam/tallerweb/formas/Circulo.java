package ar.edu.unlam.tallerweb.formas;

public class Circulo {
	Double radio;
	public Circulo(Double radio){
		this.radio=radio;
	}
	
	public Double CalcularAreaCirculo(){
		return this.radio.doubleValue()*this.radio.doubleValue()*Math.PI;
	}
	
	public Double CalcularPerimetroCirculo(){
		return this.radio.doubleValue()*2*Math.PI;
	}
}
