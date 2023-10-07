package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {

		setCelda1(new Celda(codigo1));
		setCelda2(new Celda(codigo2));
		setCelda3(new Celda(codigo3));
		setCelda4(new Celda(codigo4));
	}

	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
		System.out.println(saldo);
	}

	public Celda buscarCelda(String codigoCelda) {
		if (codigoCelda.equals(celda1.getCodigo())) {
			return celda1;
		} else if (codigoCelda.equals(celda2.getCodigo())) {
			return celda2;
		} else if (codigoCelda.equals(celda3.getCodigo())) {
			return celda3;
		} else if (codigoCelda.equals(celda4.getCodigo())) {
			return celda4;
		} else {
			return null;
		}

	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {

		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		} else {
			System.out.println("Celda no encontrada para el codigo: " + codigoCelda);
		}

	}

	public void mostrarProductos() {

		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda celda : celdas) {
			System.out.println("*********CELDA: " + celda.getCodigo() + "\n" + "STOCK: " + celda.getStock() + "\n"
					+ (celda.getProducto() != null ? "NOMBRE : " + celda.getProducto().getNombre() + "\n" + "PRECIO : "
							+ celda.getProducto().getPrecio() + "\n" + "CODIGO : " + celda.getProducto().getCodigo()
							: "La celda no tiene producto!!!"));
		}
		System.out.println((saldo > 0 ? "SALDO: " + saldo : ""));

	}

	public Producto buscarProductoEnCelda(String codigoCelda) {

		if (codigoCelda.equals(celda1.getCodigo())) {
			return celda1.getProducto();
		} else if (codigoCelda.equals(celda2.getCodigo())) {
			return celda2.getProducto();
		} else if (codigoCelda.equals(celda3.getCodigo())) {
			return celda3.getProducto();
		} else if (codigoCelda.equals(celda4.getCodigo())) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public Double consultarPrecio(String codigoCelda) {

		if (codigoCelda.equals(celda1.getCodigo())) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda.equals(celda2.getCodigo())) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda.equals(celda3.getCodigo())) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda.equals(celda4.getCodigo())) {
			return celda4.getProducto().getPrecio();
		} else {
			return null;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {

		if (celda1.getProducto() != null && codigoProducto.equals(celda1.getProducto().getCodigo())) {
			return celda1;
		} else if (celda2.getProducto() != null && codigoProducto.equals(celda2.getProducto().getCodigo())) {
			return celda2;
		} else if (celda3.getProducto() != null && codigoProducto.equals(celda3.getProducto().getCodigo())) {
			return celda3;
		} else if (celda4.getProducto() != null && codigoProducto.equals(celda4.getProducto().getCodigo())) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigoProducto, int stock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual + stock);
	}

	public void vender(String codigoCelda) {
		Celda celdaVenta = buscarCelda(codigoCelda);
		int stock = celdaVenta.getStock();
		double precio = celdaVenta.getProducto().getPrecio();
		if (stock > 0) {
			stock--;
			saldo = saldo + precio;
			celdaVenta.setStock(stock);
		}
	}

	public Double venderConCambio(String codigoCelda, double valor) {
		Celda celdaVenta = buscarCelda(codigoCelda);
		int stock = celdaVenta.getStock();
		double precio = celdaVenta.getProducto().getPrecio();
		double vuelto;
		vuelto = valor - saldo;
		if (stock > 0) {
			stock--;
			saldo = saldo + precio;
			celdaVenta.setStock(stock);
			return vuelto;
		} else {
			return null;
		}
	}

	public MaquinaDulces() {
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
