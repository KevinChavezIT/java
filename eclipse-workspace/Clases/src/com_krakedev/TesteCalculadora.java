package com_krakedev;

public class TesteCalculadora {

	public static void main(String[] args) {

		int respuestaSuma;
		int respuestaResta;

		Calculadora suma = new Calculadora();
		Calculadora resta = new Calculadora();

		respuestaSuma = suma.sumar(5, 10);

		respuestaResta = resta.restar(10, 5);

		System.out.println("Respuesta SUMA: " + respuestaSuma);
		System.out.println("Respuesta RESTA: " + respuestaResta);
	}
}
