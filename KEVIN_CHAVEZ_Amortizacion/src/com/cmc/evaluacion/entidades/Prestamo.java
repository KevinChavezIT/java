package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new ArrayList<>(plazo);
		this.clientes = new ArrayList<>();

	}

	public void mostarPrestamo() {
		if (!clientes.isEmpty()) {
			System.out.println("Monto: " + monto + ", Interés: " + interes + ", Plazo: " + plazo);
		} else {
			System.out.println("No hay cliente asociado a este préstamo.");
		}
	}

	public void asociarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setCuotas(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

}