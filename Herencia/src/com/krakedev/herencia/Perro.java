package com.krakedev.herencia;

public class Perro extends Animal {

	public Perro() {
		System.out.println("ejecucion constructor de perro");
	}

	public void ladrar() {
		System.out.println("wauuu wauuu");
	}

	@Override
	public void dormir() {
		super.dormir();
		System.out.println("perro durmiendo");
	}
}
