package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestrProducto {

	public static void main(String[] args) {

		Producto ejemplo = new Producto(1, "mouse");
		ejemplo.setDescripcion("gamer rgb");
		ejemplo.setPeso(5);

		System.out.println("Producto codigo: " + ejemplo.getCodigo());
		System.out.println("Nombre: " + ejemplo.getNombre());
		System.out.println("Descripcion: " + ejemplo.getDescripcion());
		System.out.println("Peso: " + ejemplo.getPeso());
	}

}
