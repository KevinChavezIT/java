package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("inicio");
		String a = "sf";

		try {

			System.out.println("ABRE CONEXION BDD");
			a.substring(3);
			System.out.println("fin");
			

		} catch (Exception ex) {

			System.out.println("entra al catch");

		} finally {

			System.out.println("ENTRA FINALLY");
			System.out.println("CIERRA CONEXION BDD");
		}

		System.out.println("FUERA catch");
	}

}
