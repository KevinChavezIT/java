package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("claro", "0963050592", 24);
		Contacto c1 = new Contacto("bowser", "malo", telef, 90);
		
		telef.getNumero();
		telef.getOperadora();
		c1.setTelefono(telef);
		
		AdminContactos admin = new AdminContactos();
		
		admin.activarUsuario(c1);
		
		if (c1.isActivo()) {
			System.out.println("ACTIVO");
		}else {
			System.out.println("INACTIVO");
		}
	}

}
