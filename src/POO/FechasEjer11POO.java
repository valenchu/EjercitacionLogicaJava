package POO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FechasEjer11POO {
	// Atributos
	private int dia;
	private int mes;
	private int ano;

	// Constructor
	public FechasEjer11POO(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Metodo que sirve para mostrar el objeto como String
	@Override
	public String toString() {
		return "FechasEjer10POO [A�O=" + ano + ", MES=" + mes + ", DIA=" + dia + "]";
	}

	// MEtodo que muestra los a�os transcurridos entre la fecha del usuario y el a�o
	// actual
	public void anosEntreFechas() {
		// Fecha que ingreso el usuario
		LocalDate l1 = LocalDate.of(this.ano, this.mes, this.dia);
		// Fecha actual
		LocalDate l2 = LocalDate.now();
		// Muestro ambas fechas
		System.out.println("Fecha del usuario = " + l1);
		System.out.println("Fecha actual = " + l2);
		// La clase ChronoUnit incluida en java 8 permite comparar cuantos a�os entre
		// dos fechas entre otras cosas
		long anosTranscurrido = ChronoUnit.YEARS.between(l1, l2);
		// Muestro los a�os de diferencia
		System.out.println("La cantidad de a�os que hay entre estas dos fechas es = " + anosTranscurrido);
	}

}
