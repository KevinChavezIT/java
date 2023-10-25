package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int numero) {

		if (numero >= 0 && numero < 10) {
			return "0" + String.valueOf(numero);
		}

		return String.valueOf(numero);
	}

	public static String formatearDia(int numero) {
		switch (numero) {
		case 0:
			return "Lunes";
		case 1:
			return "Martes";
		case 2:
			return "Miércoles";
		case 3:
			return "Jueves";
		case 4:
			return "Viernes";
		case 5:
			return "Sábado";
		case 6:
			return "Domingo";
		default:
			return "Día no válido";
		}
	}
}
