package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {

	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<>();

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {

		System.out.println("Cedula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDirección: "
				+ "\n   Calle Principal: " + direccion.getCallePrincipal() + "\n   Calle Secundaria: "
				+ direccion.getCalleSecundaria());
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {

		System.out.println("Telefonos con estado 'C':");
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("C"))
				System.out.println("Numero: " + telefono.getNumero() + ", Tipo: " + telefono.getTipo());
		}

	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("E")) {
				telefonosIncorrectos.add(telefono);
			}
		}
		return telefonosIncorrectos;
	}

}
