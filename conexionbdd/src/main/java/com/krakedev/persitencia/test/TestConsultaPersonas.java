package com.krakedev.persitencia.test;

import java.util.ArrayList;

import com.krakedev.persitencia.entidades.Persona;
import com.krakedev.persitencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {

		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("a");
			System.out.println(personas);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
