package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {

		String valorRecuperado;

		ArrayList<String> cadenas;
		cadenas = new ArrayList<String>();

		System.out.println(cadenas.size());

		cadenas.add("domi");
		cadenas.add("alessa");

		System.out.println(cadenas.size());

		valorRecuperado = cadenas.get(0);
		System.out.println(valorRecuperado);

		String cadena;
		for (int i = 0; i < cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println("cadena: " + cadena);
		}

	}
}
