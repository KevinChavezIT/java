package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigoCelda) {

		Celda celda = new Celda(codigoCelda);
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elementCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementCelda = celdas.get(i);
			System.out.println("Celda: " + elementCelda.getCodigo());
		}

	}

	public Celda buscarCelda(String codigoCelda) {

		Celda celdaEncontrada = null;
		Celda elementCelda = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementCelda = celdas.get(i);
			if (codigoCelda.equals(elementCelda.getCodigo())) {

				celdaEncontrada = elementCelda;
			}
		}
		return celdaEncontrada;

	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {

		Celda celdaRecuperada = buscarCelda(codigoCelda);

		if (celdaRecuperada != null) {

			celdaRecuperada.ingresarProducto(producto, cantidad);
		} else {
			System.out.println("Celda no encontrada codigo: " + codigoCelda);
		}

	}

	public void mostrarProductos() {

		for (Celda celda : celdas) {
			System.out.println("CELDA:" + celda.getCodigo() + " " + "STOCK:" + celda.getStock() + " "
					+ (celda.getProducto() != null
							? "PRODUCTO:" + celda.getProducto().getCodigo() + " " + "PRECIO:"
									+ celda.getProducto().getPrecio()
							: "Sin producto asignado"));
		}
		System.out.println((saldo > 0 ? "SALDO: " + saldo : ""));
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {

		for (Celda celda : celdas) {
			if (codigoCelda.equals(celda.getCodigo())) {
				return celda.getProducto();
			}
		}
		return null;
	}

	public Double consultarPrecio(String codigoCelda) {

		for (Celda celda : celdas) {
			if (codigoCelda.equals(celda.getCodigo())) {
				return celda.getProducto().getPrecio();
			}

		}
		return null;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {

		for (Celda celda : celdas) {
			if (celda.getProducto() != null && codigoProducto.equals(celda.getProducto().getCodigo())) {
				return celda;
			}
		}
		return null;
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

	public ArrayList<Celda> buscarMenores(double limite) {

		ArrayList<Celda> menores = new ArrayList<Celda>();

		Celda elementProduct = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementProduct = celdas.get(i);
			if (elementProduct.getProducto().getPrecio() < limite) {
				menores.add(elementProduct);
				System.out.println("Nombre:" + elementProduct.getProducto().getNombre() + " " + "Precio:"
						+ elementProduct.getProducto().getPrecio());
			}

		}
		return menores;

	}

}