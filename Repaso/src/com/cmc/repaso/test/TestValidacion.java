package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {

		Validacion validar = new Validacion();
		validar.validarMonto(0);
		validar.validarMonto(10);
	}

}
