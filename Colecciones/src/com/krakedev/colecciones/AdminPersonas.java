package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {

	private ArrayList<Persona> personas;

	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {

		personas.add(persona);
	}

	public void imprimir() {
		Persona elementPerosnas;
		for (int i = 0; i < personas.size(); i++) {
			elementPerosnas = personas.get(i);
			System.out.println(elementPerosnas.getNombre() + " " + elementPerosnas.getApellido() + " "
					+ elementPerosnas.getEdad());
		}

	}

	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada = null;
		Persona elementPerson = null;

		for (int i = 0; i < personas.size(); i++) {
			elementPerson = personas.get(i);
			if (nombre.equals(elementPerson.getNombre())) {

				personaEncontrada = elementPerson;
			}
		}
		return personaEncontrada;
	}

	public ArrayList<Persona> buscarMayores(int edad) {

		ArrayList<Persona> mayores = new ArrayList<Persona>();

		Persona elemenPerson = null;
		for (int i = 0; i < personas.size(); i++) {

			elemenPerson = personas.get(i);

			if (elemenPerson.getEdad() > edad) {
				mayores.add(elemenPerson);
			}
		}

		return mayores;

	}
}
