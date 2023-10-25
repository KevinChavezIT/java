package com.krakedev.estaticos;

public class Calculos {

	// FINAL hace constantes sin posibilidad a ser cambiado su valor
	private final double IVA = 12;

	public double calcularIva(double monto) {
		return monto * IVA / 100;
	}

}
