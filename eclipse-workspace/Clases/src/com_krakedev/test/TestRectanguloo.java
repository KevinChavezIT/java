package com_krakedev.test;

import com_krakedev.Rectangulo;

public class TestRectanguloo {

	public static void main(String[] args) {

		Rectangulo a = new Rectangulo(5,5);
		Rectangulo a2 = new Rectangulo(8,3);

		int area;
		int area2;
		double perimetro;
		double perimetro2;

		a.setCalcularArea();
		a.setCalcularPerimetro();
		area = a.getCalcularArea();
		System.out.println("Area1 igual: " + area);
		perimetro = a.getCalcularPerimetro();
		System.out.println("Perimetro igual: " + perimetro);
		
		System.out.println("------------------------------");
		
		a2.setCalcularArea();
		a2.setCalcularPerimetro();
		area2 = a2.getCalcularArea();
		System.out.println("Area igual: " + area2);
		perimetro2 = a2.getCalcularPerimetro();
		System.out.println("Perimetro igual: " + perimetro2);
	}

}
