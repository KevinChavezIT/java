package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {

		AdminAlarmas admin = new AdminAlarmas();

		Alarma a1 = new Alarma(DiasSemana.LUNES, 9, 10);
		Alarma a2 = new Alarma(DiasSemana.MARTES, 6, 10);
		Alarma a3 = new Alarma(DiasSemana.MIERCOLES, 16, 20);
		Alarma a4 = new Alarma(DiasSemana.JUEVES, 18, 30);
		Alarma a5 = new Alarma(DiasSemana.VIERNES, 20, 40);
		Alarma a6 = new Alarma(DiasSemana.SABADO, 22, 50);
		Alarma a7 = new Alarma(DiasSemana.DOMINGO, 24, 60);

		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		admin.agregarAlarma(a5);
		admin.agregarAlarma(a6);
		admin.agregarAlarma(a7);
		
		ArrayList<Alarma>alarmasActuales=admin.getAlarmas();
		
		System.out.println(alarmasActuales);

	}

}
