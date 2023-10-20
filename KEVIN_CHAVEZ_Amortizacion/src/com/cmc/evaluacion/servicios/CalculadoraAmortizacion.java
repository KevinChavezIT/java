package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota;
		double monto = prestamo.getMonto();
		double interes = prestamo.getInteres();
		int plazo = prestamo.getPlazo();

		cuota = (monto * (interes / 12 / 100)) / (1 - Math.pow(1 + ((interes / 12 / 100)), -plazo));
		return cuota;
	}

	private static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double valorInteres = cuotaActual.getInicio() * (interes / 12 / 100);
		double abonoCapital = cuotaActual.getCuota() - valorInteres;
		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(valorInteres);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);
		cuotaActual.setCapital(cuotaActual.getInicio());

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		} else {
			cuotaActual.setSaldo(0);
			cuotaActual.setAbonoCapital(cuotaActual.getInicio());
		}
	}

	public static void generarTabla(Prestamo prestamo) {
		double interes = prestamo.getInteres();
		double valorCuota = calcularCuota(prestamo);
		double monto = prestamo.getMonto();

		for (int i = 1; i <= prestamo.getPlazo(); i++) {
			Cuota nuevaCuota = new Cuota(i);
			nuevaCuota.setCuota(valorCuota);
			nuevaCuota.setInicio(monto);

			prestamo.getCuotas().add(nuevaCuota);

			if (i != prestamo.getPlazo()) {
				Cuota cuotaSiguiente = new Cuota(i + 1);
				calcularValoresCuota(interes, nuevaCuota, cuotaSiguiente);
			} else {
				calcularValoresCuota(interes, nuevaCuota, null);
			}

			monto = nuevaCuota.getSaldo();
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Número | Cuota | Capital | Interés | Abono Capital | Saldo");
		ArrayList<Cuota> cuotas = prestamo.getCuotas();

		if (cuotas != null) {
			for (int i = 0; i < cuotas.size(); i++) {
				Cuota elementoCuota = cuotas.get(i);
				elementoCuota.mostrarPrestamo();
			}
		} else {
			System.out.println("La lista de cuotas está vacía");
		}
	}
}