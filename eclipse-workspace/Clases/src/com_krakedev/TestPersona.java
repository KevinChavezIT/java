package com_krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p, p1;// paso 1 declaro una variable de tipo persona

		p1 = new Persona();
		p1.setNombre("juan");
		p1.setEdad(15);
		p1.setEstatura(1.90);

		p = new Persona(); // instanciar un objeto persona
		p.setNombre("pepe");
		p.setEdad(50);
		p.setEstatura(1.50);

		// acceder a los atributos
		System.out.println("hola: " + p.getNombre());
		System.out.println("tu edada es: " + p.getEdad());
		System.out.println("mides: " + p.getEstatura());
		System.out.println("-----------------");
		System.out.println("hola: " + p1.getNombre());
		System.out.println("tu edada es: " + p1.getEdad());
		System.out.println("mides: " + p1.getEstatura());
		System.out.println("-----------------");
		// modificar los atributos
		p.setNombre("jose");
		System.out.println("hola: " + p.getNombre());
	}
}
