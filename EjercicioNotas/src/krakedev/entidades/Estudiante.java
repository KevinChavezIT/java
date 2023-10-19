package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<>();

	public Estudiante(String cedula, String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public void agregarNota(Nota nuevaNota) {
		for (Nota nota : notas) {
			if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				System.out.println("La nota ya existe en la lista");
				return;
			}
		}
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			notas.add(nuevaNota);
			System.out.println("Nota agregada correctamente: ");
			nuevaNota.mostrar();
		} else {
			System.out.println("La nueva nota debe estar entre 0 y 10");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota notaEncontrada = this.notas.stream().filter(nota -> nota.getMateria().getCodigo().equals(codigo))
				.findFirst().get();

		if (notaEncontrada != null && nuevaNota >= 0 && nuevaNota <= 10) {
			notaEncontrada.setCalificacion(nuevaNota);
		} else {
			System.out.println("No se encontro la nota");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double total = 0;
		double promedio;
		for (Nota nota : notas) {
			total += nota.getCalificacion();
		}
		promedio = total / notas.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]");
		for (Nota nota : notas) {
			nota.mostrar();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
