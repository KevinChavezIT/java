package com_krakedev;

public class TestAuto {

	public static void main(String[] args) {

		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.marca="nissan";
		auto1.anio=2000;
		auto1.precio=5000.00;
		
		auto2.marca="ford";
		auto2.anio=2020;
		auto2.precio=10000.00;
		
		System.out.println("Auto: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		
		System.out.println("---------------------");
		
		System.out.println("Auto: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		
	}

}
