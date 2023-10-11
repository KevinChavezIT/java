package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {

		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("luigi", "bross", 25));
		admin.agregar(new Persona("goku", "z", 15));
		admin.agregar(new Persona("naruto", "hoja", 12));
		admin.agregar(new Persona("pikachu", "luz", 5));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("aa");
		if (p1 != null) {
			System.out.println("encontrado: " + p1.getNombre() + " " + p1.getEdad());

		}else {
			System.out.println("persona no encontrada");
		}
		
		ArrayList<Persona>personasMayores=admin.buscarMayores(1);
		System.out.println("Mayores: "+personasMayores.size());
	}
	

}
