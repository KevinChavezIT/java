package com.krakedev.persitencia.test;

import com.krakedev.persitencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1715638954");
			System.out.println("Persona ELIMINADA");
				
			} catch (Exception e) {
				System.out.println("error en el sistema: "+e.getMessage());
			}
	}

}
