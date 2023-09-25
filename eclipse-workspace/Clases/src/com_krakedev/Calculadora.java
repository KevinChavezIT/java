package com_krakedev;

public class Calculadora {

	private int resultadoSuma;
	private int resultadoResta;
	private double resultadoMultiplicacion;
	private double resultadoDivision;
	private double resultadoPromedio;

	public int getResultadoSuma() {
		return resultadoSuma;
	}

	public void setResultadoSuma(int num1, int num2) {
		resultadoSuma = num1 + num2;
	}

	public int getResultadoResta() {
		return resultadoResta;
	}

	public void setResultadoResta(int num1, int num2) {
		resultadoResta = num1 - num2;
	}

	public double getResultadoMultiplicacion() {
		return resultadoMultiplicacion;
	}

	public void setResultadoMultiplicacion(double num1, double num2) {
		resultadoMultiplicacion = num1 * num2;
	}

	public double getResultadoDivision() {
		return resultadoDivision;
	}

	public void setResultadoDivision(double num1, double num2) {
		resultadoDivision = num1 / num2;
	}

	public double getResultadoPromedio() {
		return resultadoPromedio;
	}

	public void setResultadoPromedio(double num1, double num2, double num3) {
		resultadoPromedio = (num1 + num2 + num3) / 3;
	}

	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
}
