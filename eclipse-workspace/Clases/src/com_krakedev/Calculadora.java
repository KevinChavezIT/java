package com_krakedev;

public class Calculadora {

	public int sumar(int num1, int num2) {

		int respuesta;
		respuesta = num1 + num2;

		return respuesta;
	}

	public int restar(int num1, int num2) {

		int respuesta;
		respuesta = num1 - num2;

		return respuesta;
	}
	
	public double multiplicar(double num1, double num2) {

		double respuesta;
		respuesta = num1 * num2;

		return respuesta;
	}
	
	public double dividir(double num1, double num2) {

		double respuesta;
		respuesta = num1 / num2;

		return respuesta;
	}
	
	public double promediar(double num1, double num2,double num3) {

		double respuesta;
		respuesta = (num1 + num2+num3)/3;

		return respuesta;
	}
	
	public void mostrarResultado() {

		System.out.println("Ahorita no joven, Sali al almuerzo. Regreos en 15 minutos");
	}
}
