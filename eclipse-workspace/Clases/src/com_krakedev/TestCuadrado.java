package com_krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado a=new Cuadrado();
		Cuadrado b=new Cuadrado();
		Cuadrado c=new Cuadrado();
		
		double area;
		double area2;
		double area3;
		double perimetro;
		double perimetro2;
		double perimetro3;
		
		a.lado=4;
		b.lado=3;
		c.lado=2;
		
		area=a.calcularArea();
		area2=b.calcularArea();
		area3=c.calcularArea();
		System.out.println("Area cuadrado: "+area);
		System.out.println("Area cuadrado: "+area2);
		System.out.println("Area cuadrado: "+area3);
		
		System.out.println("-------------------");
		
		perimetro=a.calcularPerimetro();
		perimetro2=b.calcularPerimetro();
		perimetro3=c.calcularPerimetro();
		System.out.println("Perimetro cuadrado: "+perimetro);
		System.out.println("Perimetro cuadrado: "+perimetro2);
		System.out.println("Perimetro cuadrado: "+perimetro3);
	}

}
