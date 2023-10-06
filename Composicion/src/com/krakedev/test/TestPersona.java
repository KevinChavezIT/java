package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona();

		p1.setNombre("domi");
		p1.setApellido("chavez");

		Direccion direc = new Direccion();
		direc.setCallePrincipal("chile");
		direc.setCalleSecundaria("paraiso");
		direc.setNumero("s10");
		p1.setDireccion(direc);

		String name = p1.getNombre();
		String apellido = p1.getApellido();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(name + " " + apellido);
		System.out.println(d1.getCallePrincipal() + ", " + direc.getCalleSecundaria());
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2=new Direccion("magdalena","pintado","s100");
		p2.setDireccion(d2);
		p2.setNombre("kevin");
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("ALV","NTP","WP"));
		p3.imprimir();
		}
}
