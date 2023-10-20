package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		prestamos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	public Cliente buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cedula.equals(cliente.getCedula())) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Cliente ya existe: " + cliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente = buscarCliente(cedula);

		if (cliente != null) {
			prestamos.add(prestamo);
			prestamo.asociarCliente(cliente);

			CalculadoraAmortizacion.generarTabla(prestamo);
		} else {
			System.out.println("No es cliente del banco");
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();

		for (Prestamo prestamo : prestamos) {
			ArrayList<Cliente> clientesPrestamo = prestamo.getClientes();
			if (clientesPrestamo != null) {
				for (Cliente cliente : clientesPrestamo) {
					if (cliente != null && cliente.getCedula().equals(cedula)) {
						prestamosCliente.add(prestamo);
						break;
					}
				}
			}
		}

		if (prestamosCliente.isEmpty()) {
			return null;
		} else {
			return prestamosCliente;
		}
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
}