package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {

		Estudiante calificacion= new Estudiante("dome");
		calificacion.calificar(5);
		calificacion.calificar(9);
	}

}
