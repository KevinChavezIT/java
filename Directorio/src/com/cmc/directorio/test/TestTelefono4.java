package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "098234278", 55);
		Telefono telf2 = new Telefono("claro", "098234256", 6);
		Telefono telf3 = new Telefono("claro", "098234212", 12);
		Telefono telf4 = new Telefono("movi", "098234212", 13);

		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf1);
		at.activarMensajeria(telf2);
		at.activarMensajeria(telf3);
		at.activarMensajeria(telf4);

		int cantidadClaro = at.contarClaro(telf1, telf2, telf3, telf4);

		telf1.imprimir();
		telf2.imprimir();
		telf3.imprimir();
		telf4.imprimir();
		System.out.println("CANTIDAD CLARO: " + cantidadClaro);
	}

}
