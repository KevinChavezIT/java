package com.krakedev.persitencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Transacciones {

	private int codigo;
	private String numCuenta;
	private BigDecimal monto;
	private String tipo;
	private Date fecha;
	private Date hora;

	public Transacciones() {
		super();
	}

	public Transacciones(int codigo, String numCuenta, BigDecimal monto, String tipo, Date fecha, Date hora) {
		super();
		this.codigo = codigo;
		this.numCuenta = numCuenta;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Transacciones [codigo=" + codigo + ", numCuenta=" + numCuenta + ", monto=" + monto + ", tipo=" + tipo
				+ ", fecha=" + fecha + ", hora=" + hora + "]";
	}

}
