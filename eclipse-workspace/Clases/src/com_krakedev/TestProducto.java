package com_krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.nombre = "paracetamol";
		productoA.descripcion = "cura todo";
		productoA.precio = 50.0;
		productoA.stockActual = 100;

		productoB.nombre = "lemonflu";
		productoB.descripcion = "resfriado";
		productoB.precio = 25.0;
		productoB.stockActual = 55;

		productoC.nombre = "alcazerse ";
		productoC.descripcion = "chuchaqui";
		productoC.precio = 40.0;
		productoC.stockActual = 200;

		System.out.println("nombre: " + productoA.nombre);
		System.out.println("descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("stockActual: " + productoA.stockActual);

		System.out.println("---------------------");

		System.out.println("nombre: " + productoB.nombre);
		System.out.println("descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("stockActual: " + productoB.stockActual);
		
		System.out.println("---------------------");

		System.out.println("nombre: " + productoC.nombre);
		System.out.println("descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("stockActual: " + productoC.stockActual);

	}

}
