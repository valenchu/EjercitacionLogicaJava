package Colecciones.Alumnos;

import java.util.ArrayList;

public class Alumnos {
	// Atributos
	private String nombreAlumno;
	private ArrayList<Integer> nota = new ArrayList<Integer>();

	// Constructores lleno vacio
	public Alumnos(String nombreAlumno, ArrayList<Integer> nota) {
		this.nombreAlumno = nombreAlumno;
		this.nota = nota;
	}

	public Alumnos() {
	}

	// GettersAndSetters
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public ArrayList<Integer> getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota.add(nota);
	}
	
	public void imprimir() {//Imprime el nombre y las 3 notas del alumno
		System.out.println(this.nombreAlumno);
		System.out.println("NOTAS");
		for (int i = 0; i < this.nota.size(); i++) {
			String c = (i == 0)?"Nota "+i+" == "+this.nota.get(i):" //Nota "+i+" == "+this.nota.get(i);
			System.out.print(c);
		}
		System.out.println();
	}
	public int notaFinal() {
		int suma = 0;
		for (int i = 0; i < this.nota.size(); i++) {
			suma = suma + this.nota.get(i);//Sumo todas las notas
		}
		return suma/this.nota.size();//Retorno el promedio
	}

}
