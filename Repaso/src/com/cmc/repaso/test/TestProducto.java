package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto product = new Producto("shampoo", 5.00);

		product.setPrecio(-100.00);

		System.out.println("Precio Producto: " + product.getPrecio() + " " + product.getNombre());
		System.out.println("Precio Final: " + product.calcularPrecioPromo(20));
	}

}
