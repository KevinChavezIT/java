package com_krakedev;

public class Cuadrado {

	int lado;
	
	public double calcularArea() {

		double area;
		area = (lado*2) + (lado*2);
		return area;
	}
	
	public double calcularPerimetro() {

		double perimetro;
		perimetro = lado*4;
		return perimetro;
	}
}
