package com.krakedev.ejemplounit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void testSumar() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, 5);
		assertTrue(resultado == 10);
	}

	@Test
	public void testRestar() {
		Calculadora c = new Calculadora();
		int resultado = c.restar(10, 5);
		assertTrue(resultado == 5);
	}

}
