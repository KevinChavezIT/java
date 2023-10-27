package com.krakedev.persitencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persitencia.entidades.Transacciones;
import com.krakedev.persitencia.servicios.AdminTransacciones;
import com.krakedev.persitencia.utils.Convertidor;

public class TestActualizarTransaccion {

	public static void main(String[] args) {

		Transacciones t = new Transacciones();

		try {
			Date fechaNac = Convertidor.convertirFecha("2023/10/27");
			Date horaNac = Convertidor.convertirHora("15:07:50");
			t.setFecha(fechaNac);
			t.setHora(horaNac);
			t.setMonto(new BigDecimal(100000.50));
			t.setTipo("D");
			t.setNumCuenta("00000");
			t.setCodigo(0);
			AdminTransacciones.actualizar(t);
			System.out.println("Persona ACTUALIZADA");

		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
