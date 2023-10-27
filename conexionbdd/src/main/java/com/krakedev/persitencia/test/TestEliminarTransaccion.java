package com.krakedev.persitencia.test;

import com.krakedev.persitencia.servicios.AdminTransacciones;

public class TestEliminarTransaccion {

	public static void main(String[] args) {
		try {
			AdminTransacciones.eliminar(1);
			System.out.println("transaccion ELIMINADA");

		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
	}

}
