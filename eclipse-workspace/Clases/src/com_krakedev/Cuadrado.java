package com_krakedev;

public class Cuadrado {

	private int calcularArea;
	private int calcularPerimetro;
	int lado;

	public int getCalcularArea() {
		return calcularArea;
	}

	public void setCalcularArea() {
		calcularArea = (lado * 2) + (lado * 2);
	}

	public int getCalcularPerimetro() {
		return calcularPerimetro;
	}

	public void setCalcularPerimetro() {
		calcularPerimetro = lado * 4;
	}

}
