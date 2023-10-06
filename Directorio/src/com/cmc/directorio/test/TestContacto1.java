package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {

		Telefono telef = new Telefono("claro", "098234278", 55);
		Contacto c = new Contacto("Dome", "Vega", telef, 10);
		telef.getNumero();
		telef.getOperadora();
		c.setTelefono(telef);

		c.getNombre();
		c.getApellido();
		c.getPeso();
		c.imprimir();
	}

}
