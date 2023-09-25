package com_krakedev;

public class TestAuto {

	public static void main(String[] args) {

		Auto auto1 = new Auto("nissan", 2000, 5000.00);
		Auto auto2 = new Auto("ford", 2020, 10000.00);

		System.out.println("Auto: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("---------------------");

		System.out.println("Auto: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}
}
