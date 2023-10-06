package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {

		Telefono telf1 = new Telefono("claro", "098234278", 5);
		Telefono telf2 = new Telefono("claro", "098234256", 15);
		Telefono telf3 = new Telefono("movi", "098234212", 25);

		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf1);
		at.activarMensajeria(telf2);
		at.activarMensajeria(telf3);

		int cantidadMovi = at.contarMovi(telf1, telf2, telf3);

		telf1.imprimir();
		telf2.imprimir();
		telf3.imprimir();
		System.out.println("CANTIDAD MOVI: " + cantidadMovi);
	}

}
