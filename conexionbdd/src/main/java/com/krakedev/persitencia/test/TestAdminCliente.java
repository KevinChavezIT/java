package com.krakedev.persitencia.test;

import java.util.Date;

import com.krakedev.persitencia.entidades.Empleado;
import com.krakedev.persitencia.servicios.AdminEmpleado;
import com.krakedev.persitencia.utils.Convertidor;

public class TestAdminCliente {

	public static void main(String[] args) {

		Empleado em = new Empleado();

		try {
			Date fecha = Convertidor.convertirFecha("2027/07/27");
			Date hora = Convertidor.convertirHora("17:27:07");
			em.setCodigo(7);
			em.setNombre("Cris");
			em.setFecha(fecha);
			em.setHora(hora);
			AdminEmpleado.insertar(em);
			System.out.println("Cliente AGREGADO");

		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
	}

}
