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

		respuestaSuma = suma.sumar(5, 5);

		respuestaResta = resta.restar(20, 5);
		
		respuestaMulti = multiplicacion.multiplicar(5, 4);

		respuestaDivision = division.dividir(100, 4);
		
		respuestaPromedio = promedio.promediar(10, 10,10);

		System.out.println("Respuesta SUMA: " + respuestaSuma);
		System.out.println("Respuesta RESTA: " + respuestaResta);
		System.out.println("Respuesta MULTIPLIACION: " + respuestaMulti);
		System.out.println("Respuesta DIVISION: " + respuestaDivision);
		System.out.println("Respuesta PROMEDIO: " + respuestaPromedio);
		mensaje.mostrarResultado();
	}
}
