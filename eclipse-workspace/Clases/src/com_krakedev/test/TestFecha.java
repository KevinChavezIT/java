package com_krakedev.test;

import com_krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		
		Fecha fecha1=new Fecha(2000,6,7);

		System.out.println("Fecha: "+fecha1.getAnio()
		+"-"+fecha1.getMes()+"-"+fecha1.getDia());
	}

}
