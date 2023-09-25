package com_krakedev;

public class TestFecha {

	public static void main(String[] args) {
		
		Fecha fecha1=new Fecha();
		
		fecha1.setAnio(20000);
		fecha1.setMes(6);
		fecha1.setDia(7);
		
		System.out.println("Fecha: "+fecha1.getAnio()
		+"-"+fecha1.getMes()+"-"+fecha1.getDia());
	}

}
