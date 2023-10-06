package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {

		Producto mc;
		AdminProducto admin = new AdminProducto();
		Producto productA = new Producto("chifles", 50);
		Producto productB = new Producto("papas", 80);

		mc = admin.buscarMasCaro(productA, productB);

		if (mc == null) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Muy caro: " + mc.getNombre());
		}
	}

}
