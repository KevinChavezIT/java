package com.krakedev.persitencia.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.krakedev.persitencia.entidades.Persona;
import com.krakedev.persitencia.servicios.AdminPersonas;

public class TestConsultarCantidadAhorrada {

	public static void main(String[] args) {

		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorCantidadAhorrada(new BigDecimal(1000.0));
			System.out.println(personas);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
