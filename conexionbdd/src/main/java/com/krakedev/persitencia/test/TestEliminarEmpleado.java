package com.krakedev.persitencia.test;

import com.krakedev.persitencia.servicios.AdminEmpleado;

public class TestEliminarEmpleado {

	public static void main(String[] args) {
		try {
			AdminEmpleado.eliminar(777);
			System.out.println("empleado ELIMINADO");
				
			} catch (Exception e) {
				System.out.println("error en el sistema: "+e.getMessage());
			}
	}

	}

