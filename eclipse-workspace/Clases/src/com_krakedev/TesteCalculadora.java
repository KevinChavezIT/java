package com_krakedev;

public class TesteCalculadora {

	public static void main(String[] args) {

		int respuestaSuma;
		int respuestaResta;
		double respuestaMulti;
		double respuestaDivision;
		double respuestaPromedio;

		Calculadora suma = new Calculadora();
		Calculadora resta = new Calculadora();
		Calculadora multiplicacion = new Calculadora();
		Calculadora division = new Calculadora();
		Calculadora promedio = new Calculadora();
		Calculadora mensaje = new Calculadora();

		suma.setResultadoSuma(5, 5);
		respuestaSuma = suma.getResultadoSuma();

		resta.setResultadoResta(20, 5);
		respuestaResta = resta.getResultadoResta();

		multiplicacion.setResultadoMultiplicacion(5, 4);
		respuestaMulti = multiplicacion.getResultadoMultiplicacion();

		division.setResultadoDivision(100, 4);
		respuestaDivision = division.getResultadoDivision();

		promedio.setResultadoPromedio(10, 10, 10);
		respuestaPromedio = promedio.getResultadoPromedio();

		System.out.println("Respuesta SUMA: " + respuestaSuma);
		System.out.println("Respuesta RESTA: " + respuestaResta);
		System.out.println("Respuesta MULTIPLIACION: " + respuestaMulti);
		System.out.println("Respuesta DIVISION: " + respuestaDivision);
		System.out.println("Respuesta PROMEDIO: " + respuestaPromedio);
		mensaje.mostrarResultado();
	}
}
