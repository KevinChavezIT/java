package com.krakedev.herencia;

public class Testerencia {

	public static void main(String[] args) {

		Perro p = new Perro();
		p.dormir();
		p.ladrar();
		Animal a = new Animal();
		System.out.println(a.hashCode());
	}

}
