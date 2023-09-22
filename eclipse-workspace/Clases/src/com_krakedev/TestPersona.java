package com_krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p, p1;// paso 1 declaro una variable de tipo persona

		p1 = new Persona();
		p1.nombre = "juan";
		p1.edad = 15;
		p1.estatura = 1.90;

		p = new Persona(); // instanciar un objeto persona
		p.nombre = "mario";
		p.edad = 12;
		p.estatura = 1.70;

		// acceder a los atributos
		System.out.println("hola: " + p.nombre + ", " + p1.nombre);
		System.out.println("tu edada es: " + p.edad);
		System.out.println("mides: " + p.estatura);
		System.out.println("-----------------");
		System.out.println("hola: " + p1.nombre);
		System.out.println("tu edada es: " + p1.edad);
		System.out.println("mides: " + p1.estatura);

		// modificar los atributos
		p.nombre = "jose";
		System.out.println("hola: " + p.nombre + ", " + p1.nombre);
	}
}
