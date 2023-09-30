package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales = 0;
	private int productosDevueltos = 0;
	private int productosVendidos = 0;

	public void vender(int productosVendidos) {
		if (productosActuales >= productosVendidos) {
			productosActuales -= productosVendidos;
			this.productosVendidos += productosVendidos;
		}
	}

	public void devolver(int productosVendidos) {
		if (productosActuales >= productosVendidos) {
			productosActuales += productosVendidos;
			this.productosVendidos -= productosVendidos;
			this.productosDevueltos += productosVendidos;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("STOCK ACTUAL: " + productosActuales);
		System.out.println("PRODUCTOS DEVUELTOS: " + productosDevueltos);
		System.out.println("PRODUCTOS VENDIDOS: " + productosVendidos);
	}
}
