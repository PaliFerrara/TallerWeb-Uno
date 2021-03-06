package ar.edu.unlam.tallerweb.formas;

public class Triangulo {
	Double ladoUno;
	Double ladoDos;
	Double ladoTres;
	
	public Triangulo(Double ladoUno,Double ladoDos,Double ladoTres){
		this.ladoUno=ladoUno;
		this.ladoDos=ladoDos;
		this.ladoTres=ladoTres;
	}

	public Double calcularPerimetroTriangulo(){
		return this.ladoUno+this.ladoDos+this.ladoTres;
	}
	
	public Double calcularAreaTriangulo(){
		Double semiperimetro = calcularPerimetroTriangulo()/2;
		return Math.sqrt(semiperimetro*(semiperimetro-ladoUno)*(semiperimetro-ladoDos)*(semiperimetro-ladoTres));
	}
}
