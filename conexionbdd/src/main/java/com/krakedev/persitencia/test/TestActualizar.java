package com.krakedev.persitencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persitencia.entidades.EstadoCivil;
import com.krakedev.persitencia.entidades.Persona;
import com.krakedev.persitencia.servicios.AdminPersonas;
import com.krakedev.persitencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		
		EstadoCivil ec = new EstadoCivil("C", "Casado");
		Persona p = new Persona("1715638922 ", "Mbape", "Haland", ec);

		try {
			Date fechaNac = Convertidor.convertirFecha("2023/10/27");
			Date horaNac = Convertidor.convertirHora("15:07:50");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(100000.50));
			p.setNumeroHijos(777);
			p.setEstatura(2.50);
			AdminPersonas.actualizar(p);
			System.out.println("Persona ACTUALIZADA");
			
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}

	}

}
