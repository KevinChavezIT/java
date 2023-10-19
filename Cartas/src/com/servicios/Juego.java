package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores = new ArrayList<>();

	public Juego() {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
	}

	public Juego(ArrayList<String> jugadores) {
		this();
		for (int i = 0; i < jugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return this.cartasJugadores;
	}

	public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
		this.cartasJugadores = cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int indiceCarta = 0;
		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < cartasJugadores.size(); j++) {
				cartasJugadores.get(j).add(i, naipeBarajado.get(indiceCarta));
				indiceCarta++;
			}
		}
	}

	public int devolverTotal(int idJugador) {
		int total = 0;
		for (Carta carta : cartasJugadores.get(idJugador)) {
			total += carta.getNumero().getValor();
		}
		return total;
	}

	public String determinarGanador() {
		ArrayList<Integer> totales = new ArrayList<>();
		for (int i = 0; i < cartasJugadores.size(); i++) {
			totales.add(devolverTotal(i));
		}

		int indiceMaximo = 0;

		for (int i = 1; i < totales.size(); i++) {
			if (totales.get(i) > totales.get(indiceMaximo)) {
				indiceMaximo = i;
			}
		}

		return "Jugador " + (indiceMaximo + 1);
	}
}
