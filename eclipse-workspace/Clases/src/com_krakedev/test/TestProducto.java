package com_krakedev.test;

import com_krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.setNombre("paracetamol");
		productoA.setDescripcion("cura todo");
		productoA.setPrecio(50.0);
		productoA.setStockActual(100);

		productoB.setNombre("lemonflu");
		productoB.setDescripcion("resfriado");
		productoB.setPrecio(25.0);
		productoB.setStockActual(55);

		productoC.setNombre("alcazerse ");
		productoC.setDescripcion("chuchaqui");
		productoC.setPrecio(40.0);
		productoC.setStockActual(200);

		System.out.println("nombre: " + productoA.getNombre());
		System.out.println("descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("stockActual: " + productoA.getStockActual());

		System.out.println("---------------------");

		System.out.println("nombre: " + productoB.getNombre());
		System.out.println("descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("stockActual: " + productoB.getStockActual());

		System.out.println("---------------------");

		System.out.println("nombre: " + productoC.getNombre());
		System.out.println("descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("stockActual: " + productoC.getStockActual());
	}
}
