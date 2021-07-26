package POO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasEjer10POO {
	// Atributos
	private int dia;
	private int mes;
	private int ano;

	// Constructor
	public FechasEjer10POO(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Metodo que sirve para mostrar el objeto como String
	@Override
	public String toString() {
		return "FechasEjer10POO [AÑO=" + ano + ", MES=" + mes + ", DIA=" + dia + "]";
	}

	// MEtodo que muestra los años transcurridos entre la fecha del usuario y el año
	// actual
	public void anosEntreFechas() {
		// Fecha que ingreso el usuario
		LocalDate l1 = LocalDate.of(this.ano, this.mes, this.dia);
		// Fecha actual
		LocalDate l2 = LocalDate.now();
		// Muestro ambas fechas
		System.out.println("Fecha del usuario = " + l1);
		System.out.println("Fecha actual = " + l2);
		// La clase ChronoUnit incluida en java 8 permite comparar cuantos años entre
		// dos fechas entre otras cosas
		long anosTranscurrido = ChronoUnit.YEARS.between(l1, l2);
		// Muestro los años de diferencia
		System.out.println("La cantidad de años que hay entre estas dos fechas es = " + anosTranscurrido);
	}

}
