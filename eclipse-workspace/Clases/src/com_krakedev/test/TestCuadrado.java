package com_krakedev.test;

import com_krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado a = new Cuadrado();
		Cuadrado b = new Cuadrado();
		Cuadrado c = new Cuadrado();

		double area;
		double area2;
		double area3;
		double perimetro;
		double perimetro2;
		double perimetro3;

		a.lado = 5;
		b.lado = 3;
		c.lado = 2;

		a.setCalcularArea();
		b.setCalcularArea();
		c.setCalcularArea();

		area = a.getCalcularArea();
		area2 = b.getCalcularArea();
		area3 = c.getCalcularArea();
		System.out.println("Area cuadrado: " + area);
		System.out.println("Area cuadrado: " + area2);
		System.out.println("Area cuadrado: " + area3);

		System.out.println("-------------------");

		a.setCalcularPerimetro();
		b.setCalcularPerimetro();
		c.setCalcularPerimetro();

		perimetro = a.getCalcularPerimetro();
		perimetro2 = b.getCalcularPerimetro();
		perimetro3 = c.getCalcularPerimetro();
		System.out.println("Perimetro cuadrado: " + perimetro);
		System.out.println("Perimetro cuadrado: " + perimetro2);
		System.out.println("Perimetro cuadrado: " + perimetro3);
	}

}
