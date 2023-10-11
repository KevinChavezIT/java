package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Persona> personas;

		personas = new ArrayList<Persona>();

		personas.add(new Persona("domi", "chavez", 5));
		personas.add(new Persona("jon", "ismael", 15));
		personas.add(new Persona("heydi", "samaniego", 20));

		Persona elementPersona;
		for (int i = 0; i < personas.size(); i++) {
			elementPersona = personas.get(i);
			System.out.println(
					elementPersona.getNombre() + " " + elementPersona.getApellido() + " " + elementPersona.getEdad());
		}
	}

}
