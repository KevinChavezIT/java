package com.krakedev.persitencia.entidades;

import java.util.Date;

public class Empleado {

	private int codigo;
	private String nombre;
	private Date fecha;
	private Date hora;

	public Empleado() {
		super();
	}

	public Empleado(int codigo, String nombre, Date fecha, Date hora) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

}
