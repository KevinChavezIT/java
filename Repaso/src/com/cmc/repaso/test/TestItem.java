package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {

		Item producto = new Item();
		producto.setNombre("ZAPATOS");
		producto.setProductosActuales(20);
		producto.vender(3);
		System.out.println(producto.getNombre());
		producto.imprimir();
		System.out.println("*** DEVOLUCIONES ***");
		producto.devolver(2);
		producto.imprimir();

		Item producto2 = new Item();
		producto2.setNombre("CAMISAS");
		producto2.setProductosActuales(50);
		producto2.vender(15);
		System.out.println(producto2.getNombre());
		producto2.imprimir();
		System.out.println("*** DEVOLUCIONES ***");
		producto2.devolver(5);
		producto2.imprimir();
	}
}