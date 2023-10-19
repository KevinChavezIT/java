package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String msg = null;
		for (Estudiante estudianteIter : estudiantes) {
			if (estudianteIter.getCedula().equals(estudiante.getCedula())) {
				msg = "Estudiante con cedula " + estudiante.getCedula() + " encontrado.";
			}
		}
		return msg;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double total = 0;
		double promedio;
		for (Estudiante estudiante : estudiantes) {
			total += estudiante.calcularPromedioNotasEstudiante();
		}
		promedio = total / estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		for (Estudiante estudiante : estudiantes) {
			estudiante.mostrar();
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
