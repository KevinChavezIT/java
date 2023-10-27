package com.krakedev.persitencia.test;

import java.util.Date;

import com.krakedev.persitencia.entidades.Empleado;
import com.krakedev.persitencia.servicios.AdminEmpleado;
import com.krakedev.persitencia.utils.Convertidor;

public class TestActualizarEmpleado {

	public static void main(String[] args) {

		Empleado em = new Empleado();

		try {
			Date fechaNac = Convertidor.convertirFecha("2020/02/20");
			Date horaNac = Convertidor.convertirHora("20:20:20");
			em.setCodigo(1);
			em.setNombre("Mario");
			em.setFecha(fechaNac);
			em.setHora(horaNac);
			AdminEmpleado.actualizar(em);
			System.out.println("empleado ACTUALIZADO");

		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
