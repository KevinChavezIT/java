package com.krakedev.persitencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persitencia.entidades.Transacciones;
import com.krakedev.persitencia.servicios.AdminTransacciones;
import com.krakedev.persitencia.utils.Convertidor;

public class TestAdminTransaccion {

	public static void main(String[] args) {
		
		Transacciones t = new Transacciones();

		try {
			Date fechaNac = Convertidor.convertirFecha("2000/02/02");
			Date horaNac = Convertidor.convertirHora("10:15:20");
			t.setFecha(fechaNac);
			t.setHora(horaNac);
			t.setMonto(new BigDecimal(5000.50));
			t.setCodigo(111);
			t.setNumCuenta("54321");
			t.setTipo("C");
			AdminTransacciones.insertar(t);
			System.out.println("TRANSACCION AGREDADA");
			
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}

	
	}

}
