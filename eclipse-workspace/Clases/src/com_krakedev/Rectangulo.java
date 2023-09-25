package com_krakedev;

public class Rectangulo {

	private int base;
	private int altura;
	private int calcularArea;
	private double calcularPerimetro;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCalcularArea() {
		return calcularArea;
	}

	public void setCalcularArea() {
		calcularArea = base * altura;
	}

	public double getCalcularPerimetro() {
		return calcularPerimetro;
	}

	public void setCalcularPerimetro() {
		calcularPerimetro = base * 2 + altura * 2;
	}

}
