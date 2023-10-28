package com.krakedev.persitencia.test;

import com.krakedev.persitencia.entidades.Persona;
import com.krakedev.persitencia.servicios.AdminPersonas;

public class TestConsultaPorPK {

	public static void main(String[] args) {
		try {
			Persona persona = AdminPersonas.buscarPorPK("1715638922");
			System.out.println(persona);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
