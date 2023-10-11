package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {

		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("E");
		maquina.agregarCelda("F");

		Producto producto = new Producto("Papitas", 0.85, "KE34");
		maquina.cargarProducto(producto, "A", 4);

		Producto producto2 = new Producto("Doritos", 0.60, "D456");
		maquina.cargarProducto(producto2, "B", 6);

		Producto producto3 = new Producto("Chifles", 0.55, "SD34");
		maquina.cargarProducto(producto3, "C", 4);

		Producto producto4 = new Producto("Caumal", 0.90, "AG56");
		maquina.cargarProducto(producto4, "D", 6);

		Producto producto5 = new Producto("Moritas", 0.15, "KG54");
		maquina.cargarProducto(producto5, "E", 4);

		Producto producto6 = new Producto("Mentas", 0.30, "4456");
		maquina.cargarProducto(producto6, "F", 6);

		ArrayList<Celda> personasMenores = maquina.buscarMenores(0.80);
		System.out.println("Productos Menores: " + personasMenores.size());
		
	}

}
