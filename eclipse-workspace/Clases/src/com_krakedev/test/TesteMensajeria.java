package com_krakedev.test;

import com_krakedev.Mensajeria;

public class TesteMensajeria {

	public static void main(String[] args) {
		
		Mensajeria mensaje=new Mensajeria();
		
		mensaje.saludar();
		mensaje.setNombre("Mario");
		mensaje.setApellido("Bross");
		
		System.out.println("Hola: "+mensaje.getNombre()+" "+mensaje.getApellido());
		
	}
}
