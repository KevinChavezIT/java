package com_krakedev;

public class TestRectanguloo {

	public static void main(String[] args) {
		
		Rectangulo a= new Rectangulo();
		Rectangulo a2= new Rectangulo();
		
		int area;
		int area2;
		double perimetro;
		double perimetro2;
		
		a.altura=10;
		a.base=5;
		
		a2.base=8;
		a2.altura=3;
		
		area= a.calcularArea();
		System.out.println("Area1 igual: "+area);
		perimetro=a.calcularPerimetro();
		System.out.println("Perimetro igual: "+perimetro);
		
		System.out.println("------------------------------");
		
		area2=a2.calcularArea();
		System.out.println("Area igual: "+area2);
		perimetro2=a2.calcularPerimetro();
		System.out.println("Perimetro igual: "+perimetro2);
	}

}
