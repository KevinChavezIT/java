package com.krakedev.persitencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persitencia.entidades.EstadoCivil;
import com.krakedev.persitencia.entidades.Persona;
import com.krakedev.persitencia.servicios.AdminPersonas;
import com.krakedev.persitencia.utils.Convertidor;

//SYSOUT SOLO SE VA PODER USAR EN LOS TEST //////////////////

public class TestAdminPersona {

	public static void main(String[] args) {

		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("175830000", "Ronaldo", "Messi", ec);

		try {
			Date fechaNac = Convertidor.convertirFecha("2023/10/27");
			Date horaNac = Convertidor.convertirHora("13:25:20");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(5000.50));
			p.setNumeroHijos(710);
			p.setEstatura(1.50);
			AdminPersonas.insertar(p);
			System.out.println("Persona agregada");
			
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}

	}

}
