package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Contacto mp;
		AdminContactos admin = new AdminContactos();

		Telefono telef = new Telefono("movi", "0963050592", 24);
		Telefono telef2 = new Telefono("movi", "0983046771", 7);
		Contacto c1 = new Contacto("Luigi", "Broos", telef, 90);
		Contacto c2 = new Contacto("MArio", "Broos", telef2, 90);
		telef.getNumero();
		telef.getOperadora();
		c1.setTelefono(telef);

		c1.getNombre();
		c1.getApellido();
		c1.getPeso();

		telef2.getNumero();
		telef2.getOperadora();
		c2.setTelefono(telef2);

		c2.getNombre();
		c2.getApellido();
		c2.getPeso();

		mp = admin.buscarMasPesado(c1, c2);

		if (mp == null) {
			System.out.println("Son iguales");
		} else {
			System.out.println(
					"Mas pesado: " + mp.getNombre() + " " + mp.getApellido() + " " + mp.getPeso() + " " + "NUMERO: "
							+ mp.getTelefono().getNumero() + " " + "OPERADORA: " + mp.getTelefono().getOperadora());
		}
		boolean co = admin.compararOperadoras(c1, c2);
		if (co) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
