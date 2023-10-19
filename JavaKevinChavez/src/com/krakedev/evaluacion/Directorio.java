package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos = new ArrayList<>();
	private ArrayList<Contacto> incorrectos = new ArrayList<>();

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContacto(Contacto contactoNew) {

		if (contactos.isEmpty() || buscarPorCedula(contactoNew.getCedula()) == null) {
			contactos.add(contactoNew);
			setFechaModificacion(new Date());
			return true;
		}
		return false;
	}

	public Contacto buscarPorCedula(String cedulaContacto) {
		Contacto contactoEncontrado = null;
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedulaContacto)) {
				contactoEncontrado = contacto;
			}
		}
		return contactoEncontrado;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int contador = 0;

		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				contador++;
			}
		}

		return contador;
	}

	public int contarFijos() {
		int contador = 0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				if (telefono.getTipo().equals("Convencional") && telefono.getEstado() == "C") {
					contador++;
				}
			}
		}

		return contador;
	}

	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() != null) {
				correctos.add(contacto);
			} else {
				incorrectos.add(contacto);
			}
		}
		contactos = new ArrayList<>();

	}
}
