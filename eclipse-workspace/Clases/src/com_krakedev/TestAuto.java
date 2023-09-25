package com_krakedev;

public class TestAuto {

	public static void main(String[] args) {

		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.setMarca("nissan");
		auto1.setAnio(2000);
		auto1.setPrecio(5000.00);
		
		auto2.setMarca("ford");
		auto2.setAnio(2020);
		auto2.setPrecio(10000.00);
		
		System.out.println("Auto: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		System.out.println("---------------------");
		
		System.out.println("Auto: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		
	}

}
