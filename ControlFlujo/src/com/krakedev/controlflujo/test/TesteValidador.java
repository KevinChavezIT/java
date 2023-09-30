package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TesteValidador {

	public static void main(String[] args) {
		
		Validador validador=new Validador();

		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(-1);
		validador.validarEdad(5);
		validador.validarEdad(16);
	}

}
